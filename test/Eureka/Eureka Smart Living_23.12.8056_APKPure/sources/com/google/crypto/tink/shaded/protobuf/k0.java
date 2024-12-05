package com.google.crypto.tink.shaded.protobuf;

import com.google.crypto.tink.shaded.protobuf.h0;
import java.util.Iterator;
import java.util.Map;

/* loaded from: classes.dex */
class k0 implements j0 {
    private static int i(int i6, Object obj, Object obj2) {
        i0 i0Var = (i0) obj;
        androidx.appcompat.app.f0.a(obj2);
        if (i0Var.isEmpty()) {
            return 0;
        }
        Iterator it = i0Var.entrySet().iterator();
        if (!it.hasNext()) {
            return 0;
        }
        Map.Entry entry = (Map.Entry) it.next();
        entry.getKey();
        entry.getValue();
        throw null;
    }

    private static i0 j(Object obj, Object obj2) {
        i0 i0Var = (i0) obj;
        i0 i0Var2 = (i0) obj2;
        if (!i0Var2.isEmpty()) {
            if (!i0Var.i()) {
                i0Var = i0Var.l();
            }
            i0Var.k(i0Var2);
        }
        return i0Var;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j0
    public Object a(Object obj, Object obj2) {
        return j(obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j0
    public Map b(Object obj) {
        return (i0) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j0
    public Object c(Object obj) {
        return i0.d().l();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j0
    public int d(int i6, Object obj, Object obj2) {
        return i(i6, obj, obj2);
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j0
    public Map e(Object obj) {
        return (i0) obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j0
    public boolean f(Object obj) {
        return !((i0) obj).i();
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j0
    public Object g(Object obj) {
        ((i0) obj).j();
        return obj;
    }

    @Override // com.google.crypto.tink.shaded.protobuf.j0
    public h0.a h(Object obj) {
        androidx.appcompat.app.f0.a(obj);
        throw null;
    }
}
