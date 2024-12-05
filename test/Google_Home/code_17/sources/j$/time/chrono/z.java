package j$.time.chrono;

import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class z implements n, Serializable {

    /* renamed from: d, reason: collision with root package name */
    public static final z f33112d;

    /* renamed from: e, reason: collision with root package name */
    private static final z[] f33113e;
    private static final long serialVersionUID = 1466499369062886794L;

    /* renamed from: a, reason: collision with root package name */
    private final transient int f33114a;

    /* renamed from: b, reason: collision with root package name */
    private final transient j$.time.h f33115b;

    /* renamed from: c, reason: collision with root package name */
    private final transient String f33116c;

    static {
        z zVar = new z(-1, j$.time.h.P(1868, 1, 1), "Meiji");
        f33112d = zVar;
        z zVar2 = new z(0, j$.time.h.P(1912, 7, 30), "Taisho");
        z zVar3 = new z(1, j$.time.h.P(1926, 12, 25), "Showa");
        z zVar4 = new z(2, j$.time.h.P(1989, 1, 8), "Heisei");
        z zVar5 = new z(3, j$.time.h.P(2019, 5, 1), "Reiwa");
        f33113e = r8;
        z[] zVarArr = {zVar, zVar2, zVar3, zVar4, zVar5};
    }

    private z(int i8, j$.time.h hVar, String str) {
        this.f33114a = i8;
        this.f33115b = hVar;
        this.f33116c = str;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long B() {
        long f8 = j$.time.temporal.a.DAY_OF_YEAR.j().f();
        for (z zVar : f33113e) {
            f8 = Math.min(f8, ((zVar.f33115b.N() ? 366 : 365) - zVar.f33115b.J()) + 1);
            if (zVar.q() != null) {
                f8 = Math.min(f8, zVar.q().f33115b.J() - 1);
            }
        }
        return f8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long D() {
        int L8 = 1000000000 - k().f33115b.L();
        z[] zVarArr = f33113e;
        int L9 = zVarArr[0].f33115b.L();
        for (int i8 = 1; i8 < zVarArr.length; i8++) {
            z zVar = zVarArr[i8];
            L8 = Math.min(L8, (zVar.f33115b.L() - L9) + 1);
            L9 = zVar.f33115b.L();
        }
        return L8;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z i(j$.time.h hVar) {
        if (hVar.M(y.f33108d)) {
            throw new RuntimeException("JapaneseDate before Meiji 6 are not supported");
        }
        z[] zVarArr = f33113e;
        for (int length = zVarArr.length - 1; length >= 0; length--) {
            z zVar = zVarArr[length];
            if (hVar.compareTo(zVar.f33115b) >= 0) {
                return zVar;
            }
        }
        return null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static z k() {
        return f33113e[r0.length - 1];
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new F((byte) 5, this);
    }

    public static z y(int i8) {
        int i9 = i8 + 1;
        if (i9 >= 0) {
            z[] zVarArr = f33113e;
            if (i9 < zVarArr.length) {
                return zVarArr[i9];
            }
        }
        throw new RuntimeException("Invalid era: " + i8);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void E(DataOutput dataOutput) {
        dataOutput.writeByte(this.f33114a);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ boolean f(j$.time.temporal.r rVar) {
        return AbstractC3020i.i(this, rVar);
    }

    @Override // j$.time.chrono.n
    public final int getValue() {
        return this.f33114a;
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ int j(j$.time.temporal.r rVar) {
        return AbstractC3020i.f(this, rVar);
    }

    @Override // j$.time.temporal.o
    public final j$.time.temporal.w m(j$.time.temporal.r rVar) {
        j$.time.temporal.a aVar = j$.time.temporal.a.ERA;
        return rVar == aVar ? w.f33106d.m(aVar) : j$.time.temporal.n.d(this, rVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final j$.time.h n() {
        return this.f33115b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final z q() {
        if (this == k()) {
            return null;
        }
        return y(this.f33114a + 1);
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ long r(j$.time.temporal.r rVar) {
        return AbstractC3020i.g(this, rVar);
    }

    public final String toString() {
        return this.f33116c;
    }

    @Override // j$.time.temporal.o
    public final /* synthetic */ Object u(j$.time.temporal.t tVar) {
        return AbstractC3020i.m(this, tVar);
    }

    @Override // j$.time.temporal.p
    public final j$.time.temporal.m v(j$.time.temporal.m mVar) {
        return mVar.d(getValue(), j$.time.temporal.a.ERA);
    }
}
