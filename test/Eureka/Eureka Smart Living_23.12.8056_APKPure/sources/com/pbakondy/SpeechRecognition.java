package com.pbakondy;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;
import android.util.Log;
import android.view.View;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import m5.h;
import m5.k;
import org.apache.cordova.f;
import org.json.JSONArray;
import t3.b0;

/* loaded from: classes.dex */
public class SpeechRecognition extends org.apache.cordova.b {

    /* renamed from: c, reason: collision with root package name */
    private JSONArray f6071c = new JSONArray();

    /* renamed from: d, reason: collision with root package name */
    private org.apache.cordova.a f6072d;

    /* renamed from: e, reason: collision with root package name */
    private v4.a f6073e;

    /* renamed from: f, reason: collision with root package name */
    private Activity f6074f;

    /* renamed from: g, reason: collision with root package name */
    private Context f6075g;

    /* renamed from: h, reason: collision with root package name */
    private View f6076h;

    /* renamed from: i, reason: collision with root package name */
    private SpeechRecognizer f6077i;

    /* loaded from: classes.dex */
    class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            SpeechRecognition speechRecognition = SpeechRecognition.this;
            speechRecognition.f6077i = SpeechRecognizer.createSpeechRecognizer(speechRecognition.f6074f);
            SpeechRecognition.this.f6077i.setRecognitionListener(new d());
        }
    }

    /* loaded from: classes.dex */
    class b implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ org.apache.cordova.a f6079a;

        b(org.apache.cordova.a aVar) {
            this.f6079a = aVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (SpeechRecognition.this.f6077i != null) {
                SpeechRecognition.this.f6077i.stopListening();
            }
            this.f6079a.success();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public class c implements Runnable {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Intent f6081a;

        c(Intent intent) {
            this.f6081a = intent;
        }

        @Override // java.lang.Runnable
        public void run() {
            SpeechRecognition.this.f6077i.startListening(this.f6081a);
        }
    }

    /* loaded from: classes.dex */
    private class d implements RecognitionListener {
        private d() {
        }

        private String a(int i6) {
            switch (i6) {
                case 1:
                    return "Network timeout";
                case 2:
                    return "Network error";
                case 3:
                    return "Audio recording error";
                case 4:
                    return "error from server";
                case b0.CATALOGUE_NAME_FIELD_NUMBER /* 5 */:
                    return "Client side error";
                case 6:
                    return "No speech input";
                case 7:
                    return "No match";
                case 8:
                    return "RecognitionService busy";
                case 9:
                    return "Insufficient permissions";
                default:
                    return "Didn't understand, please try again.";
            }
        }

        @Override // android.speech.RecognitionListener
        public void onBeginningOfSpeech() {
        }

        @Override // android.speech.RecognitionListener
        public void onBufferReceived(byte[] bArr) {
        }

        @Override // android.speech.RecognitionListener
        public void onEndOfSpeech() {
        }

        @Override // android.speech.RecognitionListener
        public void onError(int i6) {
            String a6 = a(i6);
            Log.d("SpeechRecognition", "Error: " + a6);
            SpeechRecognition.this.f6072d.error(a6);
        }

        @Override // android.speech.RecognitionListener
        public void onEvent(int i6, Bundle bundle) {
        }

        @Override // android.speech.RecognitionListener
        public void onPartialResults(Bundle bundle) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
            Log.d("SpeechRecognition", "SpeechRecognitionListener partialResults: " + stringArrayList);
            JSONArray jSONArray = new JSONArray((Collection) stringArrayList);
            if (stringArrayList != null) {
                try {
                    if (stringArrayList.size() <= 0 || SpeechRecognition.this.f6071c.equals(jSONArray)) {
                        return;
                    }
                    SpeechRecognition.this.f6071c = jSONArray;
                    f fVar = new f(f.a.OK, jSONArray);
                    fVar.h(true);
                    SpeechRecognition.this.f6072d.sendPluginResult(fVar);
                } catch (Exception e6) {
                    e6.printStackTrace();
                    SpeechRecognition.this.f6072d.error(e6.getMessage());
                }
            }
        }

        @Override // android.speech.RecognitionListener
        public void onReadyForSpeech(Bundle bundle) {
            Log.d("SpeechRecognition", "onReadyForSpeech");
        }

        @Override // android.speech.RecognitionListener
        public void onResults(Bundle bundle) {
            ArrayList<String> stringArrayList = bundle.getStringArrayList("results_recognition");
            Log.d("SpeechRecognition", "SpeechRecognitionListener results: " + stringArrayList);
            try {
                SpeechRecognition.this.f6072d.success(new JSONArray((Collection) stringArrayList));
            } catch (Exception e6) {
                e6.printStackTrace();
                SpeechRecognition.this.f6072d.error(e6.getMessage());
            }
        }

        @Override // android.speech.RecognitionListener
        public void onRmsChanged(float f6) {
        }
    }

    private boolean g(String str) {
        if (Build.VERSION.SDK_INT < 23) {
            return true;
        }
        return this.f8371cordova.hasPermission(str);
    }

    private void h() {
        if (this.f6073e == null) {
            this.f6073e = new v4.a(this.f6072d);
        }
        List a6 = this.f6073e.a();
        if (a6 != null) {
            this.f6072d.success(new JSONArray((Collection) a6));
        } else {
            this.f6074f.sendOrderedBroadcast(new Intent("android.speech.action.GET_LANGUAGE_DETAILS"), null, this.f6073e, null, -1, null, null);
        }
    }

    private void i() {
        this.f6072d.sendPluginResult(new f(f.a.OK, g("android.permission.RECORD_AUDIO")));
    }

    private boolean j() {
        return SpeechRecognizer.isRecognitionAvailable(this.f6075g);
    }

    private void k() {
        l("android.permission.RECORD_AUDIO");
    }

    private void l(String str) {
        if (g(str)) {
            this.f6072d.success();
        } else {
            this.f8371cordova.requestPermission(this, 23456, str);
        }
    }

    private void m(String str, int i6, String str2, Boolean bool, Boolean bool2) {
        Log.d("SpeechRecognition", "startListening() language: " + str + ", matches: " + i6 + ", prompt: " + str2 + ", showPartial: " + bool + ", showPopup: " + bool2);
        Intent intent = new Intent("android.speech.action.RECOGNIZE_SPEECH");
        intent.putExtra("android.speech.extra.LANGUAGE_MODEL", "free_form");
        intent.putExtra("android.speech.extra.LANGUAGE", str);
        intent.putExtra("android.speech.extra.MAX_RESULTS", i6);
        intent.putExtra("calling_package", this.f6074f.getPackageName());
        intent.putExtra("android.speech.extra.PARTIAL_RESULTS", bool);
        intent.putExtra("android.speech.extra.DICTATION_MODE", bool);
        if (str2 != null) {
            intent.putExtra("android.speech.extra.PROMPT", str2);
        }
        if (bool2.booleanValue()) {
            this.f8371cordova.startActivityForResult(this, intent, 2002);
        } else {
            this.f6076h.post(new c(intent));
        }
    }

    @Override // org.apache.cordova.b
    public boolean execute(String str, JSONArray jSONArray, org.apache.cordova.a aVar) {
        this.f6072d = aVar;
        Log.d("SpeechRecognition", "execute() action " + str);
        try {
        } catch (Exception e6) {
            e6.printStackTrace();
            aVar.error(e6.getMessage());
        }
        if ("isRecognitionAvailable".equals(str)) {
            aVar.sendPluginResult(new f(f.a.OK, j()));
            return true;
        }
        if (!"startListening".equals(str)) {
            if ("stopListening".equals(str)) {
                this.f6076h.post(new b(this.f6072d));
                return true;
            }
            if ("getSupportedLanguages".equals(str)) {
                h();
                return true;
            }
            if ("hasPermission".equals(str)) {
                i();
                return true;
            }
            if ("requestPermission".equals(str)) {
                k();
                return true;
            }
            return false;
        }
        if (!j()) {
            aVar.error("Speech recognition service is not available on the system.");
            return true;
        }
        if (!g("android.permission.RECORD_AUDIO")) {
            aVar.error("Missing permission");
            return true;
        }
        String optString = jSONArray.optString(0);
        if (optString == null || optString.isEmpty() || optString.equals("null")) {
            optString = Locale.getDefault().toString();
        }
        String str2 = optString;
        int optInt = jSONArray.optInt(1, 5);
        String optString2 = jSONArray.optString(2);
        if (optString2 == null || optString2.isEmpty() || optString2.equals("null")) {
            optString2 = null;
        }
        this.f6071c = new JSONArray();
        m(str2, optInt, optString2, Boolean.valueOf(jSONArray.optBoolean(3, false)), Boolean.valueOf(jSONArray.optBoolean(4, true)));
        return true;
    }

    @Override // org.apache.cordova.b
    public void initialize(h hVar, k kVar) {
        super.initialize(hVar, kVar);
        this.f6074f = hVar.getActivity();
        this.f6075g = kVar.getContext();
        View view = kVar.getView();
        this.f6076h = view;
        view.post(new a());
    }

    @Override // org.apache.cordova.b
    public void onActivityResult(int i6, int i7, Intent intent) {
        Log.d("SpeechRecognition", "onActivityResult() requestCode: " + i6 + ", resultCode: " + i7);
        if (i6 != 2002) {
            super.onActivityResult(i6, i7, intent);
            return;
        }
        if (i7 != -1) {
            this.f6072d.error(Integer.toString(i7));
            return;
        }
        try {
            this.f6072d.success(new JSONArray((Collection) intent.getStringArrayListExtra("android.speech.extra.RESULTS")));
        } catch (Exception e6) {
            e6.printStackTrace();
            this.f6072d.error(e6.getMessage());
        }
    }

    @Override // org.apache.cordova.b
    public void onRequestPermissionResult(int i6, String[] strArr, int[] iArr) {
        if (iArr.length <= 0 || iArr[0] != 0) {
            this.f6072d.error("Permission denied");
        } else {
            this.f6072d.success();
        }
    }
}
