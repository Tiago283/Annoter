package com.tiago.annoter.features.notes.ui.details

interface NoteDetailAction {
    data object GoBack : NoteDetailAction
    data object Delete: NoteDetailAction
}