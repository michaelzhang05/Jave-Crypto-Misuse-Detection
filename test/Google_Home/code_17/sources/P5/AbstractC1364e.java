package P5;

import b6.InterfaceC1986b;
import java.util.AbstractCollection;
import java.util.Collection;

/* renamed from: P5.e, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public abstract class AbstractC1364e extends AbstractCollection implements Collection, InterfaceC1986b {
    public abstract int getSize();

    @Override // java.util.AbstractCollection, java.util.Collection
    public final /* bridge */ int size() {
        return getSize();
    }
}
