package com.google.android.gms.internal.ads;

import java.nio.ByteBuffer;
import java.nio.ByteOrder;

/* loaded from: classes2.dex */
public interface zzlx {
    public static final ByteBuffer a = ByteBuffer.allocateDirect(0).order(ByteOrder.nativeOrder());

    void a();

    boolean b();

    void c();

    ByteBuffer d();

    int e();

    int f();

    void flush();

    boolean g(int i2, int i3, int i4) throws zzly;

    void h(ByteBuffer byteBuffer);

    boolean q();
}
