package q3;

import o3.AbstractC3524f;
import o3.C3532n;

/* loaded from: classes4.dex */
public final class J implements x5.e {

    /* renamed from: a, reason: collision with root package name */
    private final I f38130a;

    /* renamed from: b, reason: collision with root package name */
    private final L5.a f38131b;

    public J(I i8, L5.a aVar) {
        this.f38130a = i8;
        this.f38131b = aVar;
    }

    public static J a(I i8, L5.a aVar) {
        return new J(i8, aVar);
    }

    public static AbstractC3524f c(I i8, C3532n c3532n) {
        return (AbstractC3524f) x5.h.d(i8.a(c3532n));
    }

    @Override // L5.a
    /* renamed from: b, reason: merged with bridge method [inline-methods] */
    public AbstractC3524f get() {
        return c(this.f38130a, (C3532n) this.f38131b.get());
    }
}
