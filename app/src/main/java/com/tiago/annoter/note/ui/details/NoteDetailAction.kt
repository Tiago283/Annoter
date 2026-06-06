package com.tiago.annoter.note.ui.details

interface NoteDetailAction {
    data object GoBack : NoteDetailAction
    data object Delete: NoteDetailAction
}