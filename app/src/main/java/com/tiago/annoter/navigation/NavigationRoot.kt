package com.tiago.annoter.navigation

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.imePadding
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.navigation3.rememberViewModelStoreNavEntryDecorator
import androidx.navigation3.runtime.entryProvider
import androidx.navigation3.runtime.rememberNavBackStack
import androidx.navigation3.runtime.rememberSaveableStateHolderNavEntryDecorator
import androidx.navigation3.ui.NavDisplay
import com.tiago.annoter.note.domain.models.NoteModel
import com.tiago.annoter.core.ui.components.AnnoterAppBar
import com.tiago.annoter.note.ui.list.NoteListScreen
import com.tiago.annoter.note.components.CreateNoteFab
import com.tiago.annoter.task.ui.list.TaskListScreen
import com.tiago.annoter.navigation.components.AnnoterNavigationBar
import com.tiago.annoter.navigation.components.TOP_LEVEL_DESTINATIONS
import com.tiago.annoter.note.ui.details.NoteDetailScreen
import kotlin.collections.get

@Composable
fun NavigationRoot(modifier: Modifier = Modifier) {
    val backStack = rememberNavBackStack(Route.NoteList)
    val currentRoute = backStack.last()

    Scaffold(
        modifier = modifier
            .fillMaxSize()
            .imePadding(),
        topBar = {
            AnimatedVisibility(
                visible = currentRoute in TOP_LEVEL_DESTINATIONS
            ) {
                AnnoterAppBar(
                    title = TOP_LEVEL_DESTINATIONS[currentRoute]?.title
                )
            }
        },
        bottomBar = {
            AnimatedVisibility(
                visible = currentRoute in TOP_LEVEL_DESTINATIONS
            ) {
                AnnoterNavigationBar(
                    selectedKey = currentRoute,
                    onSelectKey = { if (currentRoute != it) backStack.add(it) }
                )
            }
        },
        floatingActionButton = {
            AnimatedVisibility(
                visible = currentRoute == Route.NoteList
            ) {
                CreateNoteFab {
                    backStack.add(Route.NoteDetail(NoteModel(0, "", "")))
                }
            }
        }
    ) { innerPadding ->
        NavDisplay(
            backStack = backStack,
            onBack = { backStack.removeLastOrNull() },
            modifier = Modifier
                .padding(innerPadding),
            entryDecorators = listOf(
                rememberSaveableStateHolderNavEntryDecorator(),
                rememberViewModelStoreNavEntryDecorator()
            ),
            entryProvider = entryProvider {
                entry<Route.TaskList> { TaskListScreen() }
                entry<Route.NoteList> {
                    NoteListScreen(
                        onNoteClicked = {
                            backStack.add(Route.NoteDetail(it))
                        }
                    )
                }
                entry<Route.NoteDetail> { NoteDetailScreen(note = it.note, backStack = backStack) }
            }
        )
    }
}