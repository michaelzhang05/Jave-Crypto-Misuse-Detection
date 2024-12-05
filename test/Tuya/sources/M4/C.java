package m4;

import kotlin.jvm.internal.AbstractC3151p;

/* loaded from: classes4.dex */
public final class C {

    /* renamed from: a, reason: collision with root package name */
    private final int f34947a;

    /* renamed from: b, reason: collision with root package name */
    private final Object[] f34948b;

    public C(int i8, Object[] objArr) {
        this.f34947a = i8;
        this.f34948b = objArr;
    }

    public final int a() {
        return this.f34947a;
    }

    public final Object[] b() {
        return this.f34948b;
    }

    public /* synthetic */ C(int i8, Object[] objArr, int i9, AbstractC3151p abstractC3151p) {
        this(i8, (i9 & 2) != 0 ? null : objArr);
    }
}
