package androidx.compose.ui.text.platform;

import a6.InterfaceC1670p;
import android.graphics.Typeface;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.TypefaceResult;
import kotlin.jvm.internal.AbstractC3255y;
import kotlin.jvm.internal.AbstractC3256z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidParagraphIntrinsics$resolveTypeface$1 extends AbstractC3256z implements InterfaceC1670p {
    final /* synthetic */ AndroidParagraphIntrinsics this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidParagraphIntrinsics$resolveTypeface$1(AndroidParagraphIntrinsics androidParagraphIntrinsics) {
        super(4);
        this.this$0 = androidParagraphIntrinsics;
    }

    @Override // a6.InterfaceC1670p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return m4942invokeDPcqOEQ((FontFamily) obj, (FontWeight) obj2, ((FontStyle) obj3).m4810unboximpl(), ((FontSynthesis) obj4).m4823unboximpl());
    }

    /* renamed from: invoke-DPcqOEQ, reason: not valid java name */
    public final Typeface m4942invokeDPcqOEQ(FontFamily fontFamily, FontWeight fontWeight, int i8, int i9) {
        TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList;
        State<Object> mo4782resolveDPcqOEQ = this.this$0.getFontFamilyResolver().mo4782resolveDPcqOEQ(fontFamily, fontWeight, i8, i9);
        if (!(mo4782resolveDPcqOEQ instanceof TypefaceResult.Immutable)) {
            typefaceDirtyTrackerLinkedList = this.this$0.resolvedTypefaces;
            TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList2 = new TypefaceDirtyTrackerLinkedList(mo4782resolveDPcqOEQ, typefaceDirtyTrackerLinkedList);
            this.this$0.resolvedTypefaces = typefaceDirtyTrackerLinkedList2;
            return typefaceDirtyTrackerLinkedList2.getTypeface();
        }
        Object value = mo4782resolveDPcqOEQ.getValue();
        AbstractC3255y.g(value, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) value;
    }
}
