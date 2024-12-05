package r6;

import P5.g;
import java.util.concurrent.atomic.AtomicReferenceArray;
import n6.AbstractC3483C;
import n6.C3486F;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: r6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C3695f extends AbstractC3483C {

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReferenceArray f37691e;

    public C3695f(long j8, C3695f c3695f, int i8) {
        super(j8, c3695f, i8);
        int i9;
        i9 = AbstractC3694e.f37690f;
        this.f37691e = new AtomicReferenceArray(i9);
    }

    @Override // n6.AbstractC3483C
    public int n() {
        int i8;
        i8 = AbstractC3694e.f37690f;
        return i8;
    }

    @Override // n6.AbstractC3483C
    public void o(int i8, Throwable th, g gVar) {
        C3486F c3486f;
        c3486f = AbstractC3694e.f37689e;
        r().set(i8, c3486f);
        p();
    }

    public final AtomicReferenceArray r() {
        return this.f37691e;
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f36233c + ", hashCode=" + hashCode() + ']';
    }
}
