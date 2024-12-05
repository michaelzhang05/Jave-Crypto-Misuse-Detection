package M5;

import java.util.AbstractCollection;
import java.util.Collection;

/* renamed from: M5.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1232e extends AbstractCollection implements Collection, Y5.b {
    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }
}
