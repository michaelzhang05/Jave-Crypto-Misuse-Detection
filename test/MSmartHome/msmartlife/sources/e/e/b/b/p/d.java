package e.e.b.b.p;

import android.animation.TypeEvaluator;
import android.graphics.drawable.Drawable;
import android.util.Property;

/* compiled from: CircularRevealWidget.java */
/* loaded from: classes2.dex */
public interface d {

    /* compiled from: CircularRevealWidget.java */
    /* loaded from: classes2.dex */
    public static class b implements TypeEvaluator<e> {
        public static final TypeEvaluator<e> a = new b();

        /* renamed from: b, reason: collision with root package name */
        private final e f17524b = new e();

        @Override // android.animation.TypeEvaluator
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e evaluate(float f2, e eVar, e eVar2) {
            this.f17524b.a(e.e.b.b.u.a.c(eVar.a, eVar2.a, f2), e.e.b.b.u.a.c(eVar.f17525b, eVar2.f17525b, f2), e.e.b.b.u.a.c(eVar.f17526c, eVar2.f17526c, f2));
            return this.f17524b;
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* loaded from: classes2.dex */
    public static class c extends Property<d, e> {
        public static final Property<d, e> a = new c("circularReveal");

        private c(String str) {
            super(e.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public e get(d dVar) {
            return dVar.getRevealInfo();
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, e eVar) {
            dVar.setRevealInfo(eVar);
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* renamed from: e.e.b.b.p.d$d, reason: collision with other inner class name */
    /* loaded from: classes2.dex */
    public static class C0220d extends Property<d, Integer> {
        public static final Property<d, Integer> a = new C0220d("circularRevealScrimColor");

        private C0220d(String str) {
            super(Integer.class, str);
        }

        @Override // android.util.Property
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public Integer get(d dVar) {
            return Integer.valueOf(dVar.getCircularRevealScrimColor());
        }

        @Override // android.util.Property
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public void set(d dVar, Integer num) {
            dVar.setCircularRevealScrimColor(num.intValue());
        }
    }

    /* compiled from: CircularRevealWidget.java */
    /* loaded from: classes2.dex */
    public static class e {
        public float a;

        /* renamed from: b, reason: collision with root package name */
        public float f17525b;

        /* renamed from: c, reason: collision with root package name */
        public float f17526c;

        public void a(float f2, float f3, float f4) {
            this.a = f2;
            this.f17525b = f3;
            this.f17526c = f4;
        }

        private e() {
        }

        public e(float f2, float f3, float f4) {
            this.a = f2;
            this.f17525b = f3;
            this.f17526c = f4;
        }
    }

    void a();

    void b();

    int getCircularRevealScrimColor();

    e getRevealInfo();

    void setCircularRevealOverlayDrawable(Drawable drawable);

    void setCircularRevealScrimColor(int i2);

    void setRevealInfo(e eVar);
}
