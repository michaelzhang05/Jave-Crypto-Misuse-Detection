package com.flurry.sdk;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.UUID;

/* loaded from: classes2.dex */
public final class q0 {
    String a;

    /* renamed from: b, reason: collision with root package name */
    byte[] f10124b;

    /* loaded from: classes2.dex */
    static class a implements y1<q0> {
        a() {
        }

        @Override // com.flurry.sdk.y1
        public final v1<q0> a(int i2) {
            return new b(i2);
        }
    }

    /* loaded from: classes2.dex */
    public static class b implements v1<q0> {
        private int a;

        /* loaded from: classes2.dex */
        final class a extends DataOutputStream {
            a(OutputStream outputStream) {
                super(outputStream);
            }

            @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }
        }

        /* renamed from: com.flurry.sdk.q0$b$b, reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        final class C0167b extends DataInputStream {
            C0167b(InputStream inputStream) {
                super(inputStream);
            }

            @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() {
            }
        }

        public b(int i2) {
            this.a = 1;
            this.a = i2;
        }

        @Override // com.flurry.sdk.v1
        public final /* synthetic */ void a(OutputStream outputStream, q0 q0Var) throws IOException {
            q0 q0Var2 = q0Var;
            if (outputStream == null || q0Var2 == null) {
                return;
            }
            a aVar = new a(outputStream);
            int length = q0Var2.f10124b.length;
            if (this.a == 1) {
                aVar.writeShort(length);
            } else {
                aVar.writeInt(length);
            }
            aVar.write(q0Var2.f10124b);
            aVar.writeShort(0);
            aVar.flush();
        }

        @Override // com.flurry.sdk.v1
        public final /* synthetic */ q0 b(InputStream inputStream) throws IOException {
            int readInt;
            if (inputStream == null) {
                return null;
            }
            C0167b c0167b = new C0167b(inputStream);
            q0 q0Var = new q0((byte) 0);
            if (this.a == 1) {
                readInt = c0167b.readShort();
            } else {
                readInt = c0167b.readInt();
            }
            if (readInt == 0) {
                return null;
            }
            byte[] bArr = new byte[readInt];
            q0Var.f10124b = bArr;
            c0167b.readFully(bArr);
            c0167b.readUnsignedShort();
            return q0Var;
        }
    }

    /* synthetic */ q0(byte b2) {
        this();
    }

    public static String a(String str) {
        return ".yflurrydatasenderblock.".concat(String.valueOf(str));
    }

    public static c7<q0> b(String str) {
        return new c7<>(b0.a().getFileStreamPath(a(str)), ".yflurrydatasenderblock.", 2, new a());
    }

    private q0() {
        this.a = null;
        this.f10124b = null;
    }

    public q0(byte[] bArr) {
        this.a = null;
        this.f10124b = null;
        this.a = UUID.randomUUID().toString();
        this.f10124b = bArr;
    }
}
