package kotlin.reflect.jvm.internal.impl.protobuf;

import java.io.IOException;

/* compiled from: MessageLite.java */
/* loaded from: classes2.dex */
public interface o extends p {

    /* compiled from: MessageLite.java */
    /* loaded from: classes2.dex */
    public interface a extends Cloneable, p {
        o a();

        a w(e eVar, f fVar) throws IOException;
    }

    a c();

    void d(CodedOutputStream codedOutputStream) throws IOException;

    int e();

    a g();

    q<? extends o> h();
}
