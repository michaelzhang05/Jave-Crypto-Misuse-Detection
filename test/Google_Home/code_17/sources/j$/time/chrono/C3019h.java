package j$.time.chrono;

import j$.util.Objects;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* renamed from: j$.time.chrono.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
final class C3019h implements Serializable {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f33074e = 0;
    private static final long serialVersionUID = 57387258289L;

    /* renamed from: a, reason: collision with root package name */
    private final m f33075a;

    /* renamed from: b, reason: collision with root package name */
    final int f33076b;

    /* renamed from: c, reason: collision with root package name */
    final int f33077c;

    /* renamed from: d, reason: collision with root package name */
    final int f33078d;

    static {
        j$.com.android.tools.r8.a.h(new Object[]{j$.time.temporal.b.YEARS, j$.time.temporal.b.MONTHS, j$.time.temporal.b.DAYS});
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public C3019h(m mVar, int i8, int i9, int i10) {
        Objects.requireNonNull(mVar, "chrono");
        this.f33075a = mVar;
        this.f33076b = i8;
        this.f33077c = i9;
        this.f33078d = i10;
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(DataOutput dataOutput) {
        dataOutput.writeUTF(this.f33075a.i());
        dataOutput.writeInt(this.f33076b);
        dataOutput.writeInt(this.f33077c);
        dataOutput.writeInt(this.f33078d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3019h)) {
            return false;
        }
        C3019h c3019h = (C3019h) obj;
        if (this.f33076b == c3019h.f33076b && this.f33077c == c3019h.f33077c && this.f33078d == c3019h.f33078d) {
            if (((AbstractC3012a) this.f33075a).equals(c3019h.f33075a)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((AbstractC3012a) this.f33075a).hashCode() ^ (Integer.rotateLeft(this.f33078d, 16) + (Integer.rotateLeft(this.f33077c, 8) + this.f33076b));
    }

    public final String toString() {
        m mVar = this.f33075a;
        int i8 = this.f33078d;
        int i9 = this.f33077c;
        int i10 = this.f33076b;
        if (i10 == 0 && i9 == 0 && i8 == 0) {
            return ((AbstractC3012a) mVar).i() + " P0D";
        }
        StringBuilder sb = new StringBuilder();
        sb.append(((AbstractC3012a) mVar).i());
        sb.append(" P");
        if (i10 != 0) {
            sb.append(i10);
            sb.append('Y');
        }
        if (i9 != 0) {
            sb.append(i9);
            sb.append('M');
        }
        if (i8 != 0) {
            sb.append(i8);
            sb.append('D');
        }
        return sb.toString();
    }

    protected Object writeReplace() {
        return new F((byte) 9, this);
    }
}
