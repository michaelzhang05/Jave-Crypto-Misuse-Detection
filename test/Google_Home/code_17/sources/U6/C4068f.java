package u6;

import S5.g;
import java.util.concurrent.atomic.AtomicReferenceArray;
import q6.AbstractC3862C;
import q6.C3865F;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: u6.f, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4068f extends AbstractC3862C {

    /* renamed from: e, reason: collision with root package name */
    private final AtomicReferenceArray f40071e;

    public C4068f(long j8, C4068f c4068f, int i8) {
        super(j8, c4068f, i8);
        int i9;
        i9 = AbstractC4067e.f40070f;
        this.f40071e = new AtomicReferenceArray(i9);
    }

    @Override // q6.AbstractC3862C
    public int n() {
        int i8;
        i8 = AbstractC4067e.f40070f;
        return i8;
    }

    @Override // q6.AbstractC3862C
    public void o(int i8, Throwable th, g gVar) {
        C3865F c3865f;
        c3865f = AbstractC4067e.f40069e;
        r().set(i8, c3865f);
        p();
    }

    public final AtomicReferenceArray r() {
        return this.f40071e;
    }

    public String toString() {
        return "SemaphoreSegment[id=" + this.f38361c + ", hashCode=" + hashCode() + ']';
    }
}
