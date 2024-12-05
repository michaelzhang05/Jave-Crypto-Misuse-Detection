package androidx.compose.foundation.lazy.staggeredgrid;

import X5.o;
import X5.p;
import kotlin.jvm.functions.Function1;

@LazyStaggeredGridScopeMarker
/* loaded from: classes.dex */
public interface LazyStaggeredGridScope {

    /* renamed from: androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridScope$-CC, reason: invalid class name */
    /* loaded from: classes.dex */
    public abstract /* synthetic */ class CC {
        public static /* synthetic */ void a(LazyStaggeredGridScope lazyStaggeredGridScope, Object obj, Object obj2, StaggeredGridItemSpan staggeredGridItemSpan, o oVar, int i8, Object obj3) {
            if (obj3 == null) {
                if ((i8 & 1) != 0) {
                    obj = null;
                }
                if ((i8 & 2) != 0) {
                    obj2 = null;
                }
                if ((i8 & 4) != 0) {
                    staggeredGridItemSpan = null;
                }
                lazyStaggeredGridScope.item(obj, obj2, staggeredGridItemSpan, oVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }

        public static /* synthetic */ void b(LazyStaggeredGridScope lazyStaggeredGridScope, int i8, Function1 function1, Function1 function12, Function1 function13, p pVar, int i9, Object obj) {
            Function1 function14;
            Function1 function15;
            if (obj == null) {
                if ((i9 & 2) != 0) {
                    function14 = null;
                } else {
                    function14 = function1;
                }
                if ((i9 & 4) != 0) {
                    function12 = LazyStaggeredGridScope$items$1.INSTANCE;
                }
                Function1 function16 = function12;
                if ((i9 & 8) != 0) {
                    function15 = null;
                } else {
                    function15 = function13;
                }
                lazyStaggeredGridScope.items(i8, function14, function16, function15, pVar);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }
    }

    void item(Object obj, Object obj2, StaggeredGridItemSpan staggeredGridItemSpan, o oVar);

    void items(int i8, Function1 function1, Function1 function12, Function1 function13, p pVar);
}
