package j$.util;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.w, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3019w extends C2887n implements java.util.Set, Set {
    private static final long serialVersionUID = -9215047833775013803L;

    @Override // java.util.Collection, java.util.Set
    public boolean equals(Object obj) {
        return obj == this || this.f32249a.equals(obj);
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        return this.f32249a.hashCode();
    }
}
