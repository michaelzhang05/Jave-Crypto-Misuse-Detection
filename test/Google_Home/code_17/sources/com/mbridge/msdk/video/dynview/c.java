package com.mbridge.msdk.video.dynview;

import android.content.Context;
import android.view.View;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import java.util.List;

/* loaded from: classes4.dex */
public final class c {

    /* renamed from: a, reason: collision with root package name */
    private Context f23058a;

    /* renamed from: b, reason: collision with root package name */
    private String f23059b;

    /* renamed from: c, reason: collision with root package name */
    private int f23060c;

    /* renamed from: d, reason: collision with root package name */
    private float f23061d;

    /* renamed from: e, reason: collision with root package name */
    private float f23062e;

    /* renamed from: f, reason: collision with root package name */
    private int f23063f;

    /* renamed from: g, reason: collision with root package name */
    private int f23064g;

    /* renamed from: h, reason: collision with root package name */
    private View f23065h;

    /* renamed from: i, reason: collision with root package name */
    private List<CampaignEx> f23066i;

    /* renamed from: j, reason: collision with root package name */
    private int f23067j;

    /* renamed from: k, reason: collision with root package name */
    private boolean f23068k;

    /* renamed from: l, reason: collision with root package name */
    private List<String> f23069l;

    /* renamed from: m, reason: collision with root package name */
    private int f23070m;

    /* renamed from: n, reason: collision with root package name */
    private String f23071n;

    /* renamed from: o, reason: collision with root package name */
    private int f23072o;

    /* renamed from: p, reason: collision with root package name */
    private int f23073p;

    /* renamed from: q, reason: collision with root package name */
    private String f23074q;

    /* loaded from: classes4.dex */
    public static class a implements b {

        /* renamed from: a, reason: collision with root package name */
        private Context f23075a;

        /* renamed from: b, reason: collision with root package name */
        private String f23076b;

        /* renamed from: c, reason: collision with root package name */
        private int f23077c;

        /* renamed from: d, reason: collision with root package name */
        private float f23078d;

        /* renamed from: e, reason: collision with root package name */
        private float f23079e;

        /* renamed from: f, reason: collision with root package name */
        private int f23080f;

        /* renamed from: g, reason: collision with root package name */
        private int f23081g;

        /* renamed from: h, reason: collision with root package name */
        private View f23082h;

        /* renamed from: i, reason: collision with root package name */
        private List<CampaignEx> f23083i;

        /* renamed from: j, reason: collision with root package name */
        private int f23084j;

        /* renamed from: k, reason: collision with root package name */
        private boolean f23085k;

        /* renamed from: l, reason: collision with root package name */
        private List<String> f23086l;

        /* renamed from: m, reason: collision with root package name */
        private int f23087m;

        /* renamed from: n, reason: collision with root package name */
        private String f23088n;

        /* renamed from: o, reason: collision with root package name */
        private int f23089o;

        /* renamed from: p, reason: collision with root package name */
        private int f23090p = 1;

        /* renamed from: q, reason: collision with root package name */
        private String f23091q;

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(Context context) {
            this.f23075a = context.getApplicationContext();
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b b(float f8) {
            this.f23079e = f8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b c(int i8) {
            this.f23081g = i8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b d(int i8) {
            this.f23084j = i8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b e(int i8) {
            this.f23087m = i8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b f(int i8) {
            this.f23089o = i8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b g(int i8) {
            this.f23090p = i8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(String str) {
            this.f23076b = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b b(int i8) {
            this.f23080f = i8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b c(String str) {
            this.f23091q = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(int i8) {
            this.f23077c = i8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b b(List<String> list) {
            this.f23086l = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(float f8) {
            this.f23078d = f8;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b b(String str) {
            this.f23088n = str;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(View view) {
            this.f23082h = view;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(List<CampaignEx> list) {
            this.f23083i = list;
            return this;
        }

        @Override // com.mbridge.msdk.video.dynview.c.b
        public final b a(boolean z8) {
            this.f23085k = z8;
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
        return this.f23058a;
    }

    public final String b() {
        return this.f23059b;
    }

    public final float c() {
        return this.f23061d;
    }

    public final float d() {
        return this.f23062e;
    }

    public final int e() {
        return this.f23063f;
    }

    public final View f() {
        return this.f23065h;
    }

    public final List<CampaignEx> g() {
        return this.f23066i;
    }

    public final int h() {
        return this.f23060c;
    }

    public final int i() {
        return this.f23067j;
    }

    public final int j() {
        return this.f23064g;
    }

    public final boolean k() {
        return this.f23068k;
    }

    public final List<String> l() {
        return this.f23069l;
    }

    public final int m() {
        return this.f23072o;
    }

    public final int n() {
        return this.f23073p;
    }

    public final String o() {
        return this.f23074q;
    }

    private c(a aVar) {
        this.f23062e = aVar.f23079e;
        this.f23061d = aVar.f23078d;
        this.f23063f = aVar.f23080f;
        this.f23064g = aVar.f23081g;
        this.f23058a = aVar.f23075a;
        this.f23059b = aVar.f23076b;
        this.f23060c = aVar.f23077c;
        this.f23065h = aVar.f23082h;
        this.f23066i = aVar.f23083i;
        this.f23067j = aVar.f23084j;
        this.f23068k = aVar.f23085k;
        this.f23069l = aVar.f23086l;
        this.f23070m = aVar.f23087m;
        this.f23071n = aVar.f23088n;
        this.f23072o = aVar.f23089o;
        this.f23073p = aVar.f23090p;
        this.f23074q = aVar.f23091q;
    }
}
