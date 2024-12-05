package p6;

import O5.I;
import O5.s;
import java.util.Arrays;
import kotlin.jvm.internal.AbstractC3255y;
import o6.InterfaceC3698L;

/* loaded from: classes5.dex */
public abstract class b {

    /* renamed from: a, reason: collision with root package name */
    private d[] f37897a;

    /* renamed from: b, reason: collision with root package name */
    private int f37898b;

    /* renamed from: c, reason: collision with root package name */
    private int f37899c;

    /* renamed from: d, reason: collision with root package name */
    private y f37900d;

    public static final /* synthetic */ int b(b bVar) {
        return bVar.f37898b;
    }

    public static final /* synthetic */ d[] g(b bVar) {
        return bVar.f37897a;
    }

    public final InterfaceC3698L f() {
        y yVar;
        synchronized (this) {
            yVar = this.f37900d;
            if (yVar == null) {
                yVar = new y(this.f37898b);
                this.f37900d = yVar;
            }
        }
        return yVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final d h() {
        d dVar;
        y yVar;
        synchronized (this) {
            try {
                d[] dVarArr = this.f37897a;
                if (dVarArr == null) {
                    dVarArr = j(2);
                    this.f37897a = dVarArr;
                } else if (this.f37898b >= dVarArr.length) {
                    Object[] copyOf = Arrays.copyOf(dVarArr, dVarArr.length * 2);
                    AbstractC3255y.h(copyOf, "copyOf(this, newSize)");
                    this.f37897a = (d[]) copyOf;
                    dVarArr = (d[]) copyOf;
                }
                int i8 = this.f37899c;
                do {
                    dVar = dVarArr[i8];
                    if (dVar == null) {
                        dVar = i();
                        dVarArr[i8] = dVar;
                    }
                    i8++;
                    if (i8 >= dVarArr.length) {
                        i8 = 0;
                    }
                    AbstractC3255y.g(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                } while (!dVar.a(this));
                this.f37899c = i8;
                this.f37898b++;
                yVar = this.f37900d;
            } catch (Throwable th) {
                throw th;
            }
        }
        if (yVar != null) {
            yVar.Z(1);
        }
        return dVar;
    }

    protected abstract d i();

    protected abstract d[] j(int i8);

    /* JADX INFO: Access modifiers changed from: protected */
    public final void k(d dVar) {
        y yVar;
        int i8;
        S5.d[] b8;
        synchronized (this) {
            try {
                int i9 = this.f37898b - 1;
                this.f37898b = i9;
                yVar = this.f37900d;
                if (i9 == 0) {
                    this.f37899c = 0;
                }
                AbstractC3255y.g(dVar, "null cannot be cast to non-null type kotlinx.coroutines.flow.internal.AbstractSharedFlowSlot<kotlin.Any>");
                b8 = dVar.b(this);
            } catch (Throwable th) {
                throw th;
            }
        }
        for (S5.d dVar2 : b8) {
            if (dVar2 != null) {
                s.a aVar = O5.s.f8302b;
                dVar2.resumeWith(O5.s.b(I.f8278a));
            }
        }
        if (yVar != null) {
            yVar.Z(-1);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final int l() {
        return this.f37898b;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final d[] m() {
        return this.f37897a;
    }
}
