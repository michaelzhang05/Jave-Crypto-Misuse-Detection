package j$.util;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3169w extends C3037n implements java.util.Set, Set {
    private static final long serialVersionUID = -9215047833775013803L;

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        return obj == this || this.f33443a.equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f33443a.hashCode();
    }
}
