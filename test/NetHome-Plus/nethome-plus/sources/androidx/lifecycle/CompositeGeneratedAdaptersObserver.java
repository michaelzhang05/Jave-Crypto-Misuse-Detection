package androidx.lifecycle;

import androidx.lifecycle.f;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public class CompositeGeneratedAdaptersObserver implements h {
    private final e[] a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public CompositeGeneratedAdaptersObserver(e[] eVarArr) {
        this.a = eVarArr;
    }

    @Override // androidx.lifecycle.h
    public void a(j jVar, f.a aVar) {
        o oVar = new o();
        for (e eVar : this.a) {
            eVar.a(jVar, aVar, false, oVar);
        }
        for (e eVar2 : this.a) {
            eVar2.a(jVar, aVar, true, oVar);
        }
    }
}
