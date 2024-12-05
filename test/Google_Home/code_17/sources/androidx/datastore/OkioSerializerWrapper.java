package androidx.datastore;

import O5.I;
import S5.d;
import S6.InterfaceC1418f;
import S6.InterfaceC1419g;
import T5.b;
import androidx.datastore.core.Serializer;
import androidx.datastore.core.okio.OkioSerializer;
import kotlin.jvm.internal.AbstractC3255y;

/* loaded from: classes3.dex */
public final class OkioSerializerWrapper<T> implements OkioSerializer<T> {
    private final Serializer<T> delegate;

    public OkioSerializerWrapper(Serializer<T> delegate) {
        AbstractC3255y.i(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    public T getDefaultValue() {
        return this.delegate.getDefaultValue();
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    public Object readFrom(InterfaceC1419g interfaceC1419g, d dVar) {
        return this.delegate.readFrom(interfaceC1419g.inputStream(), dVar);
    }

    @Override // androidx.datastore.core.okio.OkioSerializer
    public Object writeTo(T t8, InterfaceC1418f interfaceC1418f, d dVar) {
        Object writeTo = this.delegate.writeTo(t8, interfaceC1418f.outputStream(), dVar);
        if (writeTo == b.e()) {
            return writeTo;
        }
        return I.f8278a;
    }
}
