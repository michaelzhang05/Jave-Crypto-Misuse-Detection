package androidx.compose.ui.viewinterop;

import O5.I;
import O5.p;
import a6.InterfaceC1668n;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidView_androidKt$updateViewHolderParams$5 extends AbstractC3256z implements InterfaceC1668n {
    public static final AndroidView_androidKt$updateViewHolderParams$5 INSTANCE = new AndroidView_androidKt$updateViewHolderParams$5();

    /* loaded from: classes.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[LayoutDirection.Ltr.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[LayoutDirection.Rtl.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    AndroidView_androidKt$updateViewHolderParams$5() {
        super(2);
    }

    @Override // a6.InterfaceC1668n
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2) {
        invoke((LayoutNode) obj, (LayoutDirection) obj2);
        return I.f8278a;
    }

    public final void invoke(LayoutNode layoutNode, LayoutDirection layoutDirection) {
        ViewFactoryHolder requireViewFactoryHolder;
        requireViewFactoryHolder = AndroidView_androidKt.requireViewFactoryHolder(layoutNode);
        int i8 = WhenMappings.$EnumSwitchMapping$0[layoutDirection.ordinal()];
        int i9 = 1;
        if (i8 == 1) {
            i9 = 0;
        } else if (i8 != 2) {
            throw new p();
        }
        requireViewFactoryHolder.setLayoutDirection(i9);
    }
}
