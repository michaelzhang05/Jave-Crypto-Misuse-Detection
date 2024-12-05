package j$.util.stream;

import j$.util.Spliterator;
import java.util.Iterator;

/* renamed from: j$.util.stream.h, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public interface InterfaceC2927h extends AutoCloseable {
    boolean isParallel();

    Iterator iterator();

    InterfaceC2927h onClose(Runnable runnable);

    InterfaceC2927h parallel();

    InterfaceC2927h sequential();

    Spliterator spliterator();

    InterfaceC2927h unordered();
}
