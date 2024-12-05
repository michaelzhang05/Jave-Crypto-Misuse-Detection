package com.facebook.t.r.g;

import cm.aptoide.pt.DeepLinkIntentReceiver;
import cm.aptoide.pt.root.execution.Command;
import cm.aptoide.pt.store.view.StoreTabGridRecyclerFragment;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: PathComponent.java */
/* loaded from: classes.dex */
public final class c {
    public final String a;

    /* renamed from: b, reason: collision with root package name */
    public final int f9581b;

    /* renamed from: c, reason: collision with root package name */
    public final int f9582c;

    /* renamed from: d, reason: collision with root package name */
    public final String f9583d;

    /* renamed from: e, reason: collision with root package name */
    public final String f9584e;

    /* renamed from: f, reason: collision with root package name */
    public final String f9585f;

    /* renamed from: g, reason: collision with root package name */
    public final String f9586g;

    /* renamed from: h, reason: collision with root package name */
    public final int f9587h;

    /* compiled from: PathComponent.java */
    /* loaded from: classes.dex */
    public enum a {
        ID(1),
        TEXT(2),
        TAG(4),
        DESCRIPTION(8),
        HINT(16);

        private final int l;

        a(int i2) {
            this.l = i2;
        }

        public int d() {
            return this.l;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public c(JSONObject jSONObject) throws JSONException {
        this.a = jSONObject.getString("class_name");
        this.f9581b = jSONObject.optInt("index", -1);
        this.f9582c = jSONObject.optInt(DeepLinkIntentReceiver.DeepLinksKeys.ID);
        this.f9583d = jSONObject.optString(Command.CommandHandler.TEXT);
        this.f9584e = jSONObject.optString(StoreTabGridRecyclerFragment.BundleCons.TAG);
        this.f9585f = jSONObject.optString("description");
        this.f9586g = jSONObject.optString("hint");
        this.f9587h = jSONObject.optInt("match_bitmask");
    }
}
