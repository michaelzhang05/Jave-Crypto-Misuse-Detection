package com.wordsbaking.cordova.tts;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.Build;
import android.speech.tts.TextToSpeech;
import android.speech.tts.UtteranceProgressListener;
import android.speech.tts.Voice;
import android.util.Log;
import com.rjfun.cordova.plugin.nativeaudio.NativeAudio;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Locale;
import java.util.Set;
import m5.h;
import m5.k;
import org.apache.cordova.b;
import org.apache.cordova.f;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class TTS extends b implements TextToSpeech.OnInitListener {
    public static final String ERR_ERROR_INITIALIZING = "ERR_ERROR_INITIALIZING";
    public static final String ERR_INVALID_OPTIONS = "ERR_INVALID_OPTIONS";
    public static final String ERR_NOT_INITIALIZED = "ERR_NOT_INITIALIZED";
    public static final String ERR_UNKNOWN = "ERR_UNKNOWN";

    /* renamed from: c, reason: collision with root package name */
    boolean f6109c = false;

    /* renamed from: d, reason: collision with root package name */
    TextToSpeech f6110d = null;

    /* renamed from: e, reason: collision with root package name */
    Context f6111e = null;

    /* loaded from: classes.dex */
    class a extends UtteranceProgressListener {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ k f6112a;

        a(k kVar) {
            this.f6112a = kVar;
        }

        @Override // android.speech.tts.UtteranceProgressListener
        public void onDone(String str) {
            if (str.equals("")) {
                return;
            }
            new org.apache.cordova.a(str, this.f6112a).success();
        }

        @Override // android.speech.tts.UtteranceProgressListener
        public void onError(String str) {
            if (str.equals("")) {
                return;
            }
            new org.apache.cordova.a(str, this.f6112a).error(TTS.ERR_UNKNOWN);
        }

        @Override // android.speech.tts.UtteranceProgressListener
        public void onStart(String str) {
        }
    }

    private void a(JSONArray jSONArray, org.apache.cordova.a aVar) {
        PackageManager packageManager = this.f6111e.getPackageManager();
        Intent intent = new Intent();
        intent.setAction("android.speech.tts.engine.INSTALL_TTS_DATA");
        if (packageManager.resolveActivity(intent, 65536) == null) {
            return;
        }
        intent.setFlags(268435456);
        this.f6111e.startActivity(intent);
    }

    private void b(JSONArray jSONArray, org.apache.cordova.a aVar) {
        String str;
        Set<Locale> availableLanguages = this.f6110d.getAvailableLanguages();
        if (availableLanguages != null) {
            Iterator<Locale> it = availableLanguages.iterator();
            str = "";
            while (it.hasNext()) {
                str = str + "," + it.next();
            }
        } else {
            str = "";
        }
        if (str != "") {
            str = str.substring(1);
        }
        aVar.sendPluginResult(new f(f.a.OK, str));
    }

    private void c(JSONArray jSONArray, org.apache.cordova.a aVar) {
        Set<Voice> voices = this.f6110d.getVoices();
        JSONArray jSONArray2 = new JSONArray();
        for (Voice voice : voices) {
            JSONObject jSONObject = new JSONObject();
            Log.v("TTS", "Voice: " + voice.getName());
            jSONObject.put("name", voice.getName());
            jSONObject.put("identifier", voice.getName());
            jSONObject.put("language", voice.getLocale());
            jSONArray2.put(jSONObject);
        }
        aVar.sendPluginResult(new f(f.a.OK, jSONArray2));
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void d(JSONArray jSONArray, org.apache.cordova.a aVar) {
        String string;
        double d6;
        StringBuilder sb;
        String str;
        Voice voice;
        TextToSpeech textToSpeech;
        float f6;
        String str2;
        JSONObject jSONObject = jSONArray.getJSONObject(0);
        if (jSONObject == null) {
            aVar.error(ERR_INVALID_OPTIONS);
            return;
        }
        if (jSONObject.isNull("text")) {
            aVar.error(ERR_INVALID_OPTIONS);
            return;
        }
        String string2 = jSONObject.getString("text");
        if (jSONObject.isNull("identifier")) {
            Log.v("TTS", "No voice identifier");
            string = "";
        } else {
            string = jSONObject.getString("identifier");
            Log.v("TTS", "got identifier: " + string);
        }
        String languageTag = jSONObject.isNull("locale") ? Locale.getDefault().toLanguageTag() : jSONObject.getString("locale");
        boolean z5 = !jSONObject.isNull("cancel") ? jSONObject.getBoolean("cancel") : 0;
        StringBuilder sb2 = new StringBuilder();
        sb2.append("cancel is set to ");
        sb2.append(z5);
        sb2.append("(");
        sb2.append(z5 != 0 ? "TextToSpeech.QUEUE_FLUSH" : "TextToSpeech.QUEUE_ADD");
        sb2.append(")");
        Log.v("TTS", sb2.toString());
        double d7 = 1.0d;
        if (jSONObject.isNull("rate")) {
            Log.v("TTS", "No rate provided, so rate is set to 1.0");
            d6 = 1.0d;
        } else {
            d6 = jSONObject.getDouble("rate");
            Log.v("TTS", "rate is set to " + d6);
        }
        if (jSONObject.isNull("pitch")) {
            sb = new StringBuilder();
            str = "No pitch provided, so pitch set to ";
        } else {
            d7 = jSONObject.getDouble("pitch");
            sb = new StringBuilder();
            str = "Pitch set to ";
        }
        sb.append(str);
        sb.append(d7);
        Log.v("TTS", sb.toString());
        if (this.f6110d == null) {
            str2 = ERR_ERROR_INITIALIZING;
        } else {
            if (this.f6109c) {
                new HashMap().put("utteranceId", aVar.getCallbackId());
                Set<Voice> voices = this.f6110d.getVoices();
                if (string.equals("")) {
                    voice = null;
                } else {
                    Iterator<Voice> it = voices.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            voice = null;
                            break;
                        }
                        voice = it.next();
                        if (voice.getName().contains(string)) {
                            Log.v("TTS", "Found Voice for identifier: " + voice.getName());
                            break;
                        }
                    }
                    if (voice == null) {
                        Log.v("TTS", "No Voice for identifier: " + string + ", we'll try the locale");
                    }
                }
                if (voice == null) {
                    String[] split = languageTag.split("-");
                    this.f6110d.setLanguage(new Locale(split[0], split[1]));
                    Iterator<Voice> it2 = voices.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            break;
                        }
                        voice = it2.next();
                        if (voice.getName().toLowerCase().contains(languageTag.toLowerCase())) {
                            Log.v("TTS", "Found Voice for locale: " + voice.getName());
                            break;
                        }
                        voice = null;
                    }
                }
                if (voice != null) {
                    Log.v("TTS", "We've got a voice: " + voice.getName());
                    this.f6110d.setVoice(voice);
                } else {
                    Log.v("TTS", "No voice found..");
                }
                if (Build.VERSION.SDK_INT >= 27) {
                    textToSpeech = this.f6110d;
                    f6 = ((float) d6) * 0.7f;
                } else {
                    textToSpeech = this.f6110d;
                    f6 = (float) d6;
                }
                textToSpeech.setSpeechRate(f6);
                this.f6110d.setPitch((float) d7);
                this.f6110d.speak(string2, !z5, null, aVar.getCallbackId());
                return;
            }
            str2 = ERR_NOT_INITIALIZED;
        }
        aVar.error(str2);
    }

    private void e(JSONArray jSONArray, org.apache.cordova.a aVar) {
        this.f6110d.stop();
    }

    @Override // org.apache.cordova.b
    public boolean execute(String str, JSONArray jSONArray, org.apache.cordova.a aVar) {
        if (str.equals("speak")) {
            d(jSONArray, aVar);
            return true;
        }
        if (str.equals(NativeAudio.STOP)) {
            e(jSONArray, aVar);
            return true;
        }
        if (str.equals("checkLanguage")) {
            b(jSONArray, aVar);
            return true;
        }
        if (str.equals("getVoices")) {
            c(jSONArray, aVar);
            return true;
        }
        if (!str.equals("openInstallTts")) {
            return false;
        }
        a(jSONArray, aVar);
        return true;
    }

    @Override // org.apache.cordova.b
    public void initialize(h hVar, k kVar) {
        this.f6111e = hVar.getActivity().getApplicationContext();
        TextToSpeech textToSpeech = new TextToSpeech(hVar.getActivity().getApplicationContext(), this);
        this.f6110d = textToSpeech;
        textToSpeech.setOnUtteranceProgressListener(new a(kVar));
    }

    @Override // android.speech.tts.TextToSpeech.OnInitListener
    public void onInit(int i6) {
        System.out.println("TTS: tts STARTED");
        if (i6 != 0) {
            this.f6110d = null;
            System.out.println("TTS: NO SUCCESS");
            return;
        }
        new HashMap().put("utteranceId", "");
        this.f6110d.setLanguage(new Locale("en", "US"));
        this.f6110d.speak("", 0, null, null);
        System.out.println("TTS: SUCCESS");
        this.f6109c = true;
    }
}
