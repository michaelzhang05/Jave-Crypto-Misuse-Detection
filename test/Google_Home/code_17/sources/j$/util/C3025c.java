package j$.util;

import java.io.Serializable;
import java.util.Comparator;
import java.util.function.Function;

/* renamed from: j$.util.c, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final /* synthetic */ class C3025c implements Comparator, Serializable {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f33314a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Comparator f33315b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f33316c;

    public /* synthetic */ C3025c(Comparator comparator, Object obj, int i8) {
        this.f33314a = i8;
        this.f33315b = comparator;
        this.f33316c = obj;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f33314a) {
            case 0:
                int compare = this.f33315b.compare(obj, obj2);
                return compare != 0 ? compare : ((Comparator) this.f33316c).compare(obj, obj2);
            default:
                Function function = (Function) this.f33316c;
                return this.f33315b.compare(function.apply(obj), function.apply(obj2));
        }
    }
}
