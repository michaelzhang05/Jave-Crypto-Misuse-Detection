package com.mbridge.msdk.video.dynview;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private Context f22003a;

    /* renamed from: b, reason: collision with root package name */
    private String f22004b;

    /* renamed from: c, reason: collision with root package name */
    private int f22005c;

    /* renamed from: d, reason: collision with root package name */
    private float f22006d;

    /* renamed from: e, reason: collision with root package name */
    private float f22007e;

    /* renamed from: f, reason: collision with root package name */
    private int f22008f;

    /* renamed from: g, reason: collision with root package name */
    private int f22009g;

    /* renamed from: h, reason: collision with root package name */
    private View f22010h;

    /* renamed from: i, reason: collision with root package name */
    private List<CampaignEx> f22011i;

    /* renamed from: j, reason: collision with root package name */
    private int f22012j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f22013k;

    /* renamed from: l, reason: collision with root package name */
    private List<String> f22014l;

    /* renamed from: m, reason: collision with root package name */
    private int f22015m;

    /* renamed from: n, reason: collision with root package name */
    private String f22016n;

    /* renamed from: o, reason: collision with root package name */
    private int f22017o;

    /* renamed from: p, reason: collision with root package name */
    private int f22018p;

    /* renamed from: q, reason: collision with root package name */
    private String f22019q;

    /* loaded from: classes4.dex */
    public static class a implements b {

        /* renamed from: a, reason: collision with root package name */
        private Context f22020a;

        /* renamed from: b, reason: collision with root package name */
        private String f22021b;

        /* renamed from: c, reason: collision with root package name */
        private int f22022c;

        /* renamed from: d, reason: collision with root package name */
        private float f22023d;

        /* renamed from: e, reason: collision with root package name */
        private float f22024e;

        /* renamed from: f, reason: collision with root package name */
        private int f22025f;

        /* renamed from: g, reason: collision with root package name */
        private int f22026g;

        /* renamed from: h, reason: collision with root package name */
        private View f22027h;

        /* renamed from: i, reason: collision with root package name */
        private List<CampaignEx> f22028i;

        /* renamed from: j, reason: collision with root package name */
        private int f22029j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f22030k;

        /* renamed from: l, reason: collision with root package name */
        private List<String> f22031l;

        /* renamed from: m, reason: collision with root package name */
        private int f22032m;

        /* renamed from: n, reason: collision with root package name */
        private String f22033n;

        /* renamed from: o, reason: collision with root package name */
        private int f22034o;

        /* renamed from: p, reason: collision with root package name */
        private int f22035p = 1;

        /* renamed from: q, reason: collision with root package name */
        private String f22036q;

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(Context context) {
            this.f22020a = context.getApplicationContext();
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b b(float f8) {
            this.f22024e = f8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b c(int i8) {
            this.f22026g = i8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b d(int i8) {
            this.f22029j = i8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b e(int i8) {
            this.f22032m = i8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b f(int i8) {
            this.f22034o = i8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b g(int i8) {
            this.f22035p = i8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(String str) {
            this.f22021b = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b b(int i8) {
            this.f22025f = i8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b c(String str) {
            this.f22036q = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(int i8) {
            this.f22022c = i8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b b(List<String> list) {
            this.f22031l = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(float f8) {
            this.f22023d = f8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b b(String str) {
            this.f22033n = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(View view) {
            this.f22027h = view;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(List<CampaignEx> list) {
            this.f22028i = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(boolean z8) {
            this.f22030k = z8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final c a() {
            return new c(this);
        }
    }

    /* loaded from: classes4.dex */
    public interface b {
        b a(float f8);

        b a(int i8);

        b a(Context context);

        b a(View view);

        b a(String str);

        b a(List<CampaignEx> list);

        b a(boolean z8);

        c a();

        b b(float f8);

        b b(int i8);

        b b(String str);

        b b(List<String> list);

        b c(int i8);

        b c(String str);

        b d(int i8);

        b e(int i8);

        b f(int i8);

        b g(int i8);
    }

    public final Context a() {
        return this.f22003a;
    }

    public final String b() {
        return this.f22004b;
    }

    public final float c() {
        return this.f22006d;
    }

    public final float d() {
        return this.f22007e;
    }

    public final int e() {
        return this.f22008f;
    }

    public final View f() {
        return this.f22010h;
    }

    public final List<CampaignEx> g() {
        return this.f22011i;
    }

    public final int h() {
        return this.f22005c;
    }

    public final int i() {
        return this.f22012j;
    }

    public final int j() {
        return this.f22009g;
    }

    public final boolean k() {
        return this.f22013k;
    }

    public final List<String> l() {
        return this.f22014l;
    }

    public final int m() {
        return this.f22017o;
    }

    public final int n() {
        return this.f22018p;
    }

    public final String o() {
        return this.f22019q;
    }

    private c(a aVar) {
        this.f22007e = aVar.f22024e;
        this.f22006d = aVar.f22023d;
        this.f22008f = aVar.f22025f;
        this.f22009g = aVar.f22026g;
        this.f22003a = aVar.f22020a;
        this.f22004b = aVar.f22021b;
        this.f22005c = aVar.f22022c;
        this.f22010h = aVar.f22027h;
        this.f22011i = aVar.f22028i;
        this.f22012j = aVar.f22029j;
        this.f22013k = aVar.f22030k;
        this.f22014l = aVar.f22031l;
        this.f22015m = aVar.f22032m;
        this.f22016n = aVar.f22033n;
        this.f22017o = aVar.f22034o;
        this.f22018p = aVar.f22035p;
        this.f22019q = aVar.f22036q;
    }
}
