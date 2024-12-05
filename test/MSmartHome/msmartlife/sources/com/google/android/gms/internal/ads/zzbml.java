package com.google.android.gms.internal.ads;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.os.PowerManager;
import android.text.TextUtils;
import android.view.Display;
import android.view.WindowManager;
import com.google.android.gms.ads.internal.zzk;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class zzbml implements zzalm<zzbmp> {
    private final Context a;

    /* renamed from: b, reason: collision with root package name */
    private final zzty f13366b;

    /* renamed from: c, reason: collision with root package name */
    private final PowerManager f13367c;

    public zzbml(Context context, zzty zztyVar) {
        this.a = context;
        this.f13366b = zztyVar;
        this.f13367c = (PowerManager) context.getSystemService("power");
    }

    @Override // com.google.android.gms.internal.ads.zzalm
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public final JSONObject b(zzbmp zzbmpVar) throws JSONException {
        boolean isScreenOn;
        JSONObject jSONObject;
        JSONArray jSONArray = new JSONArray();
        JSONObject jSONObject2 = new JSONObject();
        zzud zzudVar = zzbmpVar.f13379f;
        if (zzudVar == null) {
            jSONObject = new JSONObject();
        } else if (this.f13366b.c() != null) {
            boolean z = zzudVar.f15621c;
            JSONObject jSONObject3 = new JSONObject();
            JSONObject put = jSONObject3.put("afmaVersion", this.f13366b.b()).put("activeViewJSON", this.f13366b.c()).put("timestamp", zzbmpVar.f13377d).put("adFormat", this.f13366b.a()).put("hashCode", this.f13366b.d()).put("isMraid", false).put("isStopped", false).put("isPaused", zzbmpVar.f13375b).put("isNative", this.f13366b.e());
            if (Build.VERSION.SDK_INT >= 20) {
                isScreenOn = this.f13367c.isInteractive();
            } else {
                isScreenOn = this.f13367c.isScreenOn();
            }
            put.put("isScreenOn", isScreenOn).put("appMuted", zzk.zzll().e()).put("appVolume", zzk.zzll().d()).put("deviceVolume", zzaya.c(this.a.getApplicationContext()));
            Rect rect = new Rect();
            Display defaultDisplay = ((WindowManager) this.a.getSystemService("window")).getDefaultDisplay();
            rect.right = defaultDisplay.getWidth();
            rect.bottom = defaultDisplay.getHeight();
            jSONObject3.put("windowVisibility", zzudVar.f15622d).put("isAttachedToWindow", z).put("viewBox", new JSONObject().put("top", zzudVar.f15623e.top).put("bottom", zzudVar.f15623e.bottom).put("left", zzudVar.f15623e.left).put("right", zzudVar.f15623e.right)).put("adBox", new JSONObject().put("top", zzudVar.f15624f.top).put("bottom", zzudVar.f15624f.bottom).put("left", zzudVar.f15624f.left).put("right", zzudVar.f15624f.right)).put("globalVisibleBox", new JSONObject().put("top", zzudVar.f15625g.top).put("bottom", zzudVar.f15625g.bottom).put("left", zzudVar.f15625g.left).put("right", zzudVar.f15625g.right)).put("globalVisibleBoxVisible", zzudVar.f15626h).put("localVisibleBox", new JSONObject().put("top", zzudVar.f15627i.top).put("bottom", zzudVar.f15627i.bottom).put("left", zzudVar.f15627i.left).put("right", zzudVar.f15627i.right)).put("localVisibleBoxVisible", zzudVar.f15628j).put("hitBox", new JSONObject().put("top", zzudVar.f15629k.top).put("bottom", zzudVar.f15629k.bottom).put("left", zzudVar.f15629k.left).put("right", zzudVar.f15629k.right)).put("screenDensity", this.a.getResources().getDisplayMetrics().density);
            jSONObject3.put("isVisible", zzbmpVar.a);
            if (((Boolean) zzyt.e().c(zzacu.S1)).booleanValue()) {
                JSONArray jSONArray2 = new JSONArray();
                List<Rect> list = zzudVar.n;
                if (list != null) {
                    for (Rect rect2 : list) {
                        jSONArray2.put(new JSONObject().put("top", rect2.top).put("bottom", rect2.bottom).put("left", rect2.left).put("right", rect2.right));
                    }
                }
                jSONObject3.put("scrollableContainerBoxes", jSONArray2);
            }
            if (!TextUtils.isEmpty(zzbmpVar.f13378e)) {
                jSONObject3.put("doneReasonCode", "u");
            }
            jSONObject = jSONObject3;
        } else {
            throw new JSONException("Active view Info cannot be null.");
        }
        jSONArray.put(jSONObject);
        jSONObject2.put("units", jSONArray);
        return jSONObject2;
    }
}
