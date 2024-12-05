package com.google.android.gms.internal.ads;

/* loaded from: classes2.dex */
final class tv implements zv {
    private zv[] a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public tv(zv... zvVarArr) {
        this.a = zvVarArr;
    }

    @Override // com.google.android.gms.internal.ads.zv
    public final yv a(Class<?> cls) {
        for (zv zvVar : this.a) {
            if (zvVar.b(cls)) {
                return zvVar.a(cls);
            }
        }
        String name = cls.getName();
        throw new UnsupportedOperationException(name.length() != 0 ? "No factory is available for message type: ".concat(name) : new String("No factory is available for message type: "));
    }

    @Override // com.google.android.gms.internal.ads.zv
    public final boolean b(Class<?> cls) {
        for (zv zvVar : this.a) {
            if (zvVar.b(cls)) {
                return true;
            }
        }
        return false;
    }
}
