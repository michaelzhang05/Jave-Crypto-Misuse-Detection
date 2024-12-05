package kotlin.reflect.x.internal.l0.h;

import kotlin.jvm.internal.g;

/* compiled from: DescriptorRenderer.kt */
/* loaded from: classes2.dex */
public enum a {
    NO_ARGUMENTS(false, false, 3, null),
    UNLESS_EMPTY(true, false, 2, null),
    ALWAYS_PARENTHESIZED(true, true);


    /* renamed from: j, reason: collision with root package name */
    private final boolean f20754j;

    /* renamed from: k, reason: collision with root package name */
    private final boolean f20755k;

    a(boolean z, boolean z2) {
        this.f20754j = z;
        this.f20755k = z2;
    }

    public final boolean f() {
        return this.f20754j;
    }

    public final boolean i() {
        return this.f20755k;
    }

    /* synthetic */ a(boolean z, boolean z2, int i2, g gVar) {
        this((i2 & 1) != 0 ? false : z, (i2 & 2) != 0 ? false : z2);
    }
}
