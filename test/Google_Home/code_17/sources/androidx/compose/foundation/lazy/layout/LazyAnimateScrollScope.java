package androidx.compose.foundation.lazy.layout;

import S5.d;
import a6.InterfaceC1668n;
import androidx.compose.foundation.gestures.ScrollScope;
import androidx.compose.ui.unit.Density;

/* loaded from: classes.dex */
public interface LazyAnimateScrollScope {
    float expectedDistanceTo(int i8, int i9);

    Density getDensity();

    int getFirstVisibleItemIndex();

    int getFirstVisibleItemScrollOffset();

    int getItemCount();

    int getLastVisibleItemIndex();

    int getNumOfItemsForTeleport();

    Integer getTargetItemOffset(int i8);

    Object scroll(InterfaceC1668n interfaceC1668n, d dVar);

    void snapToItem(ScrollScope scrollScope, int i8, int i9);
}
