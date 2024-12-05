package androidx.compose.foundation.lazy;

import a6.InterfaceC1669o;
import a6.InterfaceC1670p;
import androidx.compose.foundation.ExperimentalFoundationApi;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3255y;

@LazyScopeMarker
/* loaded from: classes.dex */
public interface LazyListScope {

    /* renamed from: androidx.compose.foundation.lazy.LazyListScope$-CC, reason: invalid class name */
    /* loaded from: classes.dex */
    public abstract /* synthetic */ class CC {
        public static /* synthetic */ void a(LazyListScope lazyListScope, Object obj, InterfaceC1669o content) {
            AbstractC3255y.i(content, "content");
            lazyListScope.item(obj, null, content);
        }

        public static void b(LazyListScope lazyListScope, Object obj, Object obj2, InterfaceC1669o content) {
            AbstractC3255y.i(content, "content");
            throw new IllegalStateException("The method is not implemented".toString());
        }

        public static /* synthetic */ void c(LazyListScope lazyListScope, int i8, Function1 function1, InterfaceC1670p itemContent) {
            AbstractC3255y.i(itemContent, "itemContent");
            lazyListScope.items(i8, function1, LazyListScope$items$2.INSTANCE, itemContent);
        }

        public static void d(LazyListScope lazyListScope, int i8, Function1 function1, Function1 contentType, InterfaceC1670p itemContent) {
            AbstractC3255y.i(contentType, "contentType");
            AbstractC3255y.i(itemContent, "itemContent");
            throw new IllegalStateException("The method is not implemented".toString());
        }

        public static /* synthetic */ void i(LazyListScope lazyListScope, Object obj, InterfaceC1669o interfaceC1669o, int i8, Object obj2) {
            if (obj2 == null) {
                if ((i8 & 1) != 0) {
                    obj = null;
                }
                lazyListScope.item(obj, interfaceC1669o);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }

        public static /* synthetic */ void j(LazyListScope lazyListScope, Object obj, Object obj2, InterfaceC1669o interfaceC1669o, int i8, Object obj3) {
            if (obj3 == null) {
                if ((i8 & 1) != 0) {
                    obj = null;
                }
                if ((i8 & 2) != 0) {
                    obj2 = null;
                }
                lazyListScope.item(obj, obj2, interfaceC1669o);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: item");
        }

        public static /* synthetic */ void k(LazyListScope lazyListScope, int i8, Function1 function1, InterfaceC1670p interfaceC1670p, int i9, Object obj) {
            if (obj == null) {
                if ((i9 & 2) != 0) {
                    function1 = null;
                }
                lazyListScope.items(i8, function1, interfaceC1670p);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }

        public static /* synthetic */ void l(LazyListScope lazyListScope, int i8, Function1 function1, Function1 function12, InterfaceC1670p interfaceC1670p, int i9, Object obj) {
            if (obj == null) {
                if ((i9 & 2) != 0) {
                    function1 = null;
                }
                if ((i9 & 4) != 0) {
                    function12 = LazyListScope$items$1.INSTANCE;
                }
                lazyListScope.items(i8, function1, function12, interfaceC1670p);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: items");
        }

        public static /* synthetic */ void m(LazyListScope lazyListScope, Object obj, Object obj2, InterfaceC1669o interfaceC1669o, int i8, Object obj3) {
            if (obj3 == null) {
                if ((i8 & 1) != 0) {
                    obj = null;
                }
                if ((i8 & 2) != 0) {
                    obj2 = null;
                }
                lazyListScope.stickyHeader(obj, obj2, interfaceC1669o);
                return;
            }
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: stickyHeader");
        }
    }

    /* loaded from: classes.dex */
    public static final class DefaultImpls {
        @Deprecated
        public static void item(LazyListScope lazyListScope, Object obj, Object obj2, InterfaceC1669o content) {
            AbstractC3255y.i(content, "content");
            CC.b(lazyListScope, obj, obj2, content);
        }

        @Deprecated
        public static void items(LazyListScope lazyListScope, int i8, Function1 function1, Function1 contentType, InterfaceC1670p itemContent) {
            AbstractC3255y.i(contentType, "contentType");
            AbstractC3255y.i(itemContent, "itemContent");
            CC.d(lazyListScope, i8, function1, contentType, itemContent);
        }

        @Deprecated
        public static /* synthetic */ void item(LazyListScope lazyListScope, Object obj, InterfaceC1669o content) {
            AbstractC3255y.i(content, "content");
            CC.a(lazyListScope, obj, content);
        }

        @Deprecated
        public static /* synthetic */ void items(LazyListScope lazyListScope, int i8, Function1 function1, InterfaceC1670p itemContent) {
            AbstractC3255y.i(itemContent, "itemContent");
            CC.c(lazyListScope, i8, function1, itemContent);
        }
    }

    /* synthetic */ void item(Object obj, InterfaceC1669o interfaceC1669o);

    void item(Object obj, Object obj2, InterfaceC1669o interfaceC1669o);

    /* synthetic */ void items(int i8, Function1 function1, InterfaceC1670p interfaceC1670p);

    void items(int i8, Function1 function1, Function1 function12, InterfaceC1670p interfaceC1670p);

    @ExperimentalFoundationApi
    void stickyHeader(Object obj, Object obj2, InterfaceC1669o interfaceC1669o);
}
