package androidx.core.view;

import android.view.View;
import android.view.ViewGroup;
import i6.InterfaceC2998g;
import java.util.Iterator;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC3256z;

/* loaded from: classes3.dex */
final class ViewGroupKt$descendants$1$1 extends AbstractC3256z implements Function1 {
    public static final ViewGroupKt$descendants$1$1 INSTANCE = new ViewGroupKt$descendants$1$1();

    ViewGroupKt$descendants$1$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Iterator<View> invoke(View view) {
        InterfaceC2998g children;
        ViewGroup viewGroup = view instanceof ViewGroup ? (ViewGroup) view : null;
        if (viewGroup == null || (children = ViewGroupKt.getChildren(viewGroup)) == null) {
            return null;
        }
        return children.iterator();
    }
}
