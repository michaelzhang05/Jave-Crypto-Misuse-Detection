package androidx.datastore;

import L5.I;
import P5.d;
import P6.InterfaceC1280f;
import P6.InterfaceC1281g;
import Q5.b;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.okio.OkioSerializer;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class OkioSerializerWrapper<T> implements OkioSerializer<T> {
    private final Serializer<T> delegate;

    public OkioSerializerWrapper(Serializer<T> delegate) {
        AbstractC3159y.i(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    public T getDefaultValue() {
        return this.delegate.getDefaultValue();
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    public Object readFrom(InterfaceC1281g interfaceC1281g, d dVar) {
        return this.delegate.readFrom(interfaceC1281g.inputStream(), dVar);
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    public Object writeTo(T t8, InterfaceC1280f interfaceC1280f, d dVar) {
        Object writeTo = this.delegate.writeTo(t8, interfaceC1280f.outputStream(), dVar);
        if (writeTo == b.e()) {
            return writeTo;
        }
        return I.f6487a;
    }
}
