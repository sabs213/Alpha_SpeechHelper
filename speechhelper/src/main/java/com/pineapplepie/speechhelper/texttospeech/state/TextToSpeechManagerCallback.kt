package com.pineapplepie.speechhelper.texttospeech.state

interface TextToSpeechManagerCallback {
    fun onInit(state: InitializationState)
    fun onSpeakingStatus(state: SpeakingState)
}