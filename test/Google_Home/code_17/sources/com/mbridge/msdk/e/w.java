package com.mbridge.msdk.e;

import android.util.Log;
import com.mbridge.msdk.playercommon.exoplayer2.DefaultLoadControl;

/* loaded from: classes4.dex */
public final class w {

    /* renamed from: a, reason: collision with root package name */
    public final int f20021a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20022b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20023c;

    /* renamed from: d, reason: collision with root package name */
    public final int f20024d;

    /* renamed from: e, reason: collision with root package name */
    public final int f20025e;

    /* renamed from: f, reason: collision with root package name */
    public final int f20026f;

    /* renamed from: g, reason: collision with root package name */
    public final o f20027g;

    /* renamed from: h, reason: collision with root package name */
    public final d f20028h;

    /* renamed from: i, reason: collision with root package name */
    public final v f20029i;

    /* renamed from: j, reason: collision with root package name */
    public final f f20030j;

    /* loaded from: classes4.dex */
    public static final class a {

        /* renamed from: d, reason: collision with root package name */
        private o f20034d;

        /* renamed from: h, reason: collision with root package name */
        private d f20038h;

        /* renamed from: i, reason: collision with root package name */
        private v f20039i;

        /* renamed from: j, reason: collision with root package name */
        private f f20040j;

        /* renamed from: a, reason: collision with root package name */
        private int f20031a = 50;

        /* renamed from: b, reason: collision with root package name */
        private int f20032b = DefaultLoadControl.DEFAULT_MIN_BUFFER_MS;

        /* renamed from: c, reason: collision with root package name */
        private int f20033c = 1;

        /* renamed from: e, reason: collision with root package name */
        private int f20035e = 2;

        /* renamed from: f, reason: collision with root package name */
        private int f20036f = 50;

        /* renamed from: g, reason: collision with root package name */
        private int f20037g = 604800000;

        public final a a(int i8) {
            if (i8 <= 0) {
                this.f20031a = 50;
            } else {
                this.f20031a = i8;
            }
            return this;
        }

        public final a b(int i8) {
            if (i8 < 0) {
                this.f20032b = DefaultLoadControl.DEFAULT_MIN_BUFFER_MS;
            } else {
                this.f20032b = i8;
            }
            return this;
        }

        public final a c(int i8) {
            if (i8 <= 0) {
                this.f20035e = 2;
            } else {
                this.f20035e = i8;
            }
            return this;
        }

        public final a d(int i8) {
            if (i8 < 0) {
                this.f20036f = 50;
            } else {
                this.f20036f = i8;
            }
            return this;
        }

        public final a e(int i8) {
            if (i8 < 0) {
                this.f20037g = 604800000;
            } else {
                this.f20037g = i8;
            }
            return this;
        }

        public final a a(int i8, o oVar) {
            this.f20033c = i8;
            this.f20034d = oVar;
            return this;
        }

        public final a a(d dVar) {
            this.f20038h = dVar;
            return this;
        }

        public final a a(v vVar) {
            this.f20039i = vVar;
            return this;
        }

        public final a a(f fVar) {
            this.f20040j = fVar;
            return this;
        }

        public final w a() {
            if (y.a(this.f20038h) && com.mbridge.msdk.e.a.f19804a) {
                Log.e("TrackManager", "decorate can not be null");
            }
            if (y.a(this.f20039i) && com.mbridge.msdk.e.a.f19804a) {
                Log.e("TrackManager", "responseHandler can not be null");
            }
            if ((y.a(this.f20034d) || y.a(this.f20034d.c())) && com.mbridge.msdk.e.a.f19804a) {
                Log.e("TrackManager", "networkStackConfig or stack can not be null");
            }
            return new w(this);
        }
    }

    private w(a aVar) {
        this.f20021a = aVar.f20031a;
        this.f20022b = aVar.f20032b;
        this.f20023c = aVar.f20033c;
        this.f20024d = aVar.f20035e;
        this.f20025e = aVar.f20036f;
        this.f20026f = aVar.f20037g;
        this.f20027g = aVar.f20034d;
        this.f20028h = aVar.f20038h;
        this.f20029i = aVar.f20039i;
        this.f20030j = aVar.f20040j;
    }
}
