package a5;

import java.util.ArrayList;
import kotlin.jvm.internal.AbstractC3247p;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes5.dex */
public final class N {

    /* renamed from: a, reason: collision with root package name */
    private C1644k f14040a;

    /* renamed from: b, reason: collision with root package name */
    private ArrayList f14041b;

    /* renamed from: c, reason: collision with root package name */
    private int f14042c;

    public N(C1644k category, ArrayList apps, int i8) {
        AbstractC3255y.i(category, "category");
        AbstractC3255y.i(apps, "apps");
        this.f14040a = category;
        this.f14041b = apps;
        this.f14042c = i8;
    }

    public final ArrayList a() {
        return this.f14041b;
    }

    public final C1644k b() {
        return this.f14040a;
    }

    public final int c() {
        return this.f14042c;
    }

    public final void d(ArrayList arrayList) {
        AbstractC3255y.i(arrayList, "<set-?>");
        this.f14041b = arrayList;
    }

    public final void e(C1644k c1644k) {
        AbstractC3255y.i(c1644k, "<set-?>");
        this.f14040a = c1644k;
    }

    public final void f(int i8) {
        this.f14042c = i8;
    }

    public /* synthetic */ N(C1644k c1644k, ArrayList arrayList, int i8, int i9, AbstractC3247p abstractC3247p) {
        this((i9 & 1) != 0 ? new C1644k(0, null, null, 7, null) : c1644k, (i9 & 2) != 0 ? new ArrayList() : arrayList, (i9 & 4) != 0 ? 0 : i8);
    }
}
