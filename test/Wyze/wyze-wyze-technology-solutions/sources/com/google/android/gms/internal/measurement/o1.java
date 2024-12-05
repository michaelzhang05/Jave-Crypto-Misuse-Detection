package com.google.android.gms.internal.measurement;

/* loaded from: classes2.dex */
final class o1 implements u1 {
    private u1[] a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public o1(u1... u1VarArr) {
        this.a = u1VarArr;
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final t1 a(Class<?> cls) {
        for (u1 u1Var : this.a) {
            if (u1Var.b(cls)) {
                return u1Var.a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    @Override // com.google.android.gms.internal.measurement.u1
    public final boolean b(Class<?> cls) {
        for (u1 u1Var : this.a) {
            if (u1Var.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
