package j$.util;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: j$.util.l, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C2885l extends C2881h implements java.util.Set, Set {
    private static final long serialVersionUID = 487447009682186044L;

    @Override // java.util.Collection, java.util.Set
    public final boolean equals(Object obj) {
        boolean equals;
        if (this == obj) {
            return true;
        }
        synchronized (this.f32220b) {
            equals = this.f32219a.equals(obj);
        }
        return equals;
    }

    @Override // java.util.Collection, java.util.Set
    public final int hashCode() {
        int hashCode;
        synchronized (this.f32220b) {
            hashCode = this.f32219a.hashCode();
        }
        return hashCode;
    }
}
