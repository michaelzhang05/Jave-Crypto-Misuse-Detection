package androidx.datastore.core.handlers;

import P5.d;
import androidx.datastore.core.CorruptionException;
import androidx.datastore.core.CorruptionHandler;
import java.io.IOException;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes3.dex */
public final class ReplaceFileCorruptionHandler<T> implements CorruptionHandler<T> {
    private final Function1 produceNewData;

    public ReplaceFileCorruptionHandler(Function1 produceNewData) {
        AbstractC3159y.i(produceNewData, "produceNewData");
        this.produceNewData = produceNewData;
    }

    @Override // androidx.datastore.core.CorruptionHandler
    public Object handleCorruption(CorruptionException corruptionException, d dVar) throws IOException {
        return this.produceNewData.invoke(corruptionException);
    }
}
