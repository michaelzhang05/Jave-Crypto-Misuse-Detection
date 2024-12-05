package com.uptodown.tv.ui.activity;

import android.os.Bundle;
import android.speech.SpeechRecognizer;
import com.uptodown.R;
import k5.b;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class TvSearchActivity extends b {

    /* renamed from: d, reason: collision with root package name */
    private SpeechRecognizer f30876d;

    @Override // k5.b, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.tv_search_activity);
        if (SpeechRecognizer.isRecognitionAvailable(this)) {
            this.f30876d = SpeechRecognizer.createSpeechRecognizer(this);
        }
    }

    @Override // k5.b, androidx.fragment.app.FragmentActivity, android.app.Activity
    protected void onPause() {
        if (this.f30876d != null && SpeechRecognizer.isRecognitionAvailable(this)) {
            SpeechRecognizer speechRecognizer = this.f30876d;
            AbstractC3255y.f(speechRecognizer);
            speechRecognizer.stopListening();
            SpeechRecognizer speechRecognizer2 = this.f30876d;
            AbstractC3255y.f(speechRecognizer2);
            speechRecognizer2.cancel();
            SpeechRecognizer speechRecognizer3 = this.f30876d;
            AbstractC3255y.f(speechRecognizer3);
            speechRecognizer3.destroy();
        }
        this.f30876d = null;
        super.onPause();
    }
}
