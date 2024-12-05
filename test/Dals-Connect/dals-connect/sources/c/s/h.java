package c.s;

import android.graphics.Path;
import android.graphics.PathMeasure;
import android.graphics.PointF;
import android.util.Property;

/* compiled from: PathProperty.java */
/* loaded from: classes.dex */
class h<T> extends Property<T, Float> {
    private final Property<T, PointF> a;

    /* renamed from: b, reason: collision with root package name */
    private final PathMeasure f2986b;

    /* renamed from: c, reason: collision with root package name */
    private final float f2987c;

    /* renamed from: d, reason: collision with root package name */
    private final float[] f2988d;

    /* renamed from: e, reason: collision with root package name */
    private final PointF f2989e;

    /* renamed from: f, reason: collision with root package name */
    private float f2990f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public h(Property<T, PointF> property, Path path) {
        super(Float.class, property.getName());
        this.f2988d = new float[2];
        this.f2989e = new PointF();
        this.a = property;
        PathMeasure pathMeasure = new PathMeasure(path, false);
        this.f2986b = pathMeasure;
        this.f2987c = pathMeasure.getLength();
    }

    @Override // android.util.Property
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public Float get(T t) {
        return Float.valueOf(this.f2990f);
    }

    @Override // android.util.Property
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public void set(T t, Float f2) {
        this.f2990f = f2.floatValue();
        this.f2986b.getPosTan(this.f2987c * f2.floatValue(), this.f2988d, null);
        PointF pointF = this.f2989e;
        float[] fArr = this.f2988d;
        pointF.x = fArr[0];
        pointF.y = fArr[1];
        this.a.set(t, pointF);
    }
}
