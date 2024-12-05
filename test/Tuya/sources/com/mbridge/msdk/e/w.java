package com.mbridge.msdk.e;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f18966a;

    /* renamed from: b, reason: collision with root package name */
    public final int f18967b;

    /* renamed from: c, reason: collision with root package name */
    public final int f18968c;

    /* renamed from: d, reason: collision with root package name */
    public final int f18969d;

    /* renamed from: e, reason: collision with root package name */
    public final int f18970e;

    /* renamed from: f, reason: collision with root package name */
    public final int f18971f;

    /* renamed from: g, reason: collision with root package name */
    public final o f18972g;

    /* renamed from: h, reason: collision with root package name */
    public final d f18973h;

    /* renamed from: i, reason: collision with root package name */
    public final v f18974i;

    /* renamed from: j, reason: collision with root package name */
    public final f f18975j;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        private o f18979d;

        /* renamed from: h, reason: collision with root package name */
        private d f18983h;

        /* renamed from: i, reason: collision with root package name */
        private v f18984i;

        /* renamed from: j, reason: collision with root package name */
        private f f18985j;

        /* renamed from: a, reason: collision with root package name */
        private int f18976a = 50;

        /* renamed from: b, reason: collision with root package name */
        private int f18977b = DefaultLoadControl.DEFAULT_MIN_BUFFER_MS;

        /* renamed from: c, reason: collision with root package name */
        private int f18978c = 1;

        /* renamed from: e, reason: collision with root package name */
        private int f18980e = 2;

        /* renamed from: f, reason: collision with root package name */
        private int f18981f = 50;

        /* renamed from: g, reason: collision with root package name */
        private int f18982g = 604800000;

        public final a a(int i8) {
            if (i8 <= 0) {
                this.f18976a = 50;
            } else {
                this.f18976a = i8;
            }
            return this;
        }

        public final a b(int i8) {
            if (i8 < 0) {
                this.f18977b = DefaultLoadControl.DEFAULT_MIN_BUFFER_MS;
            } else {
                this.f18977b = i8;
            }
            return this;
        }

        public final a c(int i8) {
            if (i8 <= 0) {
                this.f18980e = 2;
            } else {
                this.f18980e = i8;
            }
            return this;
        }

        public final a d(int i8) {
            if (i8 < 0) {
                this.f18981f = 50;
            } else {
                this.f18981f = i8;
            }
            return this;
        }

        public final a e(int i8) {
            if (i8 < 0) {
                this.f18982g = 604800000;
            } else {
                this.f18982g = i8;
            }
            return this;
        }

        public final a a(int i8, o oVar) {
            this.f18978c = i8;
            this.f18979d = oVar;
            return this;
        }

        public final a a(d dVar) {
            this.f18983h = dVar;
            return this;
        }

        public final a a(v vVar) {
            this.f18984i = vVar;
            return this;
        }

        public final a a(f fVar) {
            this.f18985j = fVar;
            return this;
        }

        public final w a() {
            if (y.a(this.f18983h) && com.mbridge.msdk.e.a.f18749a) {
                Log.e("TrackManager", "decorate can not be null");
            }
            if (y.a(this.f18984i) && com.mbridge.msdk.e.a.f18749a) {
                Log.e("TrackManager", "responseHandler can not be null");
            }
            if ((y.a(this.f18979d) || y.a(this.f18979d.c())) && com.mbridge.msdk.e.a.f18749a) {
                Log.e("TrackManager", "networkStackConfig or stack can not be null");
            }
            return new w(this);
        }
    }

    private w(a aVar) {
        this.f18966a = aVar.f18976a;
        this.f18967b = aVar.f18977b;
        this.f18968c = aVar.f18978c;
        this.f18969d = aVar.f18980e;
        this.f18970e = aVar.f18981f;
        this.f18971f = aVar.f18982g;
        this.f18972g = aVar.f18979d;
        this.f18973h = aVar.f18983h;
        this.f18974i = aVar.f18984i;
        this.f18975j = aVar.f18985j;
    }
}
