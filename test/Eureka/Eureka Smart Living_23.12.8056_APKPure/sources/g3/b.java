package g3;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import t3.c0;

/* loaded from: classes.dex */
public final class b implements p {

    /* renamed from: a, reason: collision with root package name */
    private final InputStream f6706a;

    private b(InputStream inputStream) {
        this.f6706a = inputStream;
    }

    public static p c(byte[] bArr) {
        return new b(new ByteArrayInputStream(bArr));
    }

    @Override // g3.p
    public t3.t a() {
        try {
            return t3.t.Z(this.f6706a, com.google.crypto.tink.shaded.protobuf.p.b());
        } finally {
            this.f6706a.close();
        }
    }

    @Override // g3.p
    public c0 b() {
        try {
            return c0.e0(this.f6706a, com.google.crypto.tink.shaded.protobuf.p.b());
        } finally {
            this.f6706a.close();
        }
    }
}
