package j$.util.function;

import java.util.function.Predicate;

/* loaded from: classes2.dex */
public final /* synthetic */ class g implements Predicate {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f32215a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Predicate f32216b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Predicate f32217c;

    public /* synthetic */ g(Predicate predicate, Predicate predicate2, int i8) {
        this.f32215a = i8;
        this.f32216b = predicate;
        this.f32217c = predicate2;
    }

    public final /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.f32215a) {
            case 0:
                return Predicate$CC.$default$and(this, predicate);
            default:
                return Predicate$CC.$default$and(this, predicate);
        }
    }

    public final /* synthetic */ Predicate negate() {
        switch (this.f32215a) {
            case 0:
                return Predicate$CC.$default$negate(this);
            default:
                return Predicate$CC.$default$negate(this);
        }
    }

    public final /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.f32215a) {
            case 0:
                return Predicate$CC.$default$or(this, predicate);
            default:
                return Predicate$CC.$default$or(this, predicate);
        }
    }

    @Override // java.util.function.Predicate
    public final boolean test(Object obj) {
        switch (this.f32215a) {
            case 0:
                return this.f32216b.test(obj) && this.f32217c.test(obj);
            default:
                return this.f32216b.test(obj) || this.f32217c.test(obj);
        }
    }
}
