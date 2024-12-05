package androidx.compose.ui.text.platform;

import X5.p;
import android.graphics.Typeface;
import androidx.compose.runtime.State;
import androidx.compose.ui.text.font.FontFamily;
import androidx.compose.ui.text.font.FontStyle;
import androidx.compose.ui.text.font.FontSynthesis;
import androidx.compose.ui.text.font.FontWeight;
import androidx.compose.ui.text.font.TypefaceResult;
import kotlin.jvm.internal.AbstractC3159y;
import kotlin.jvm.internal.AbstractC3160z;

/* JADX INFO: Access modifiers changed from: package-private */
/* loaded from: classes.dex */
public final class AndroidParagraphIntrinsics$resolveTypeface$1 extends AbstractC3160z implements p {
    final /* synthetic */ AndroidParagraphIntrinsics this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AndroidParagraphIntrinsics$resolveTypeface$1(AndroidParagraphIntrinsics androidParagraphIntrinsics) {
        super(4);
        this.this$0 = androidParagraphIntrinsics;
    }

    @Override // X5.p
    public /* bridge */ /* synthetic */ Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        return m4937invokeDPcqOEQ((FontFamily) obj, (FontWeight) obj2, ((FontStyle) obj3).m4805unboximpl(), ((FontSynthesis) obj4).m4818unboximpl());
    }

    /* renamed from: invoke-DPcqOEQ, reason: not valid java name */
    public final Typeface m4937invokeDPcqOEQ(FontFamily fontFamily, FontWeight fontWeight, int i8, int i9) {
        TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList;
        State<Object> mo4777resolveDPcqOEQ = this.this$0.getFontFamilyResolver().mo4777resolveDPcqOEQ(fontFamily, fontWeight, i8, i9);
        if (!(mo4777resolveDPcqOEQ instanceof TypefaceResult.Immutable)) {
            typefaceDirtyTrackerLinkedList = this.this$0.resolvedTypefaces;
            TypefaceDirtyTrackerLinkedList typefaceDirtyTrackerLinkedList2 = new TypefaceDirtyTrackerLinkedList(mo4777resolveDPcqOEQ, typefaceDirtyTrackerLinkedList);
            this.this$0.resolvedTypefaces = typefaceDirtyTrackerLinkedList2;
            return typefaceDirtyTrackerLinkedList2.getTypeface();
        }
        Object value = mo4777resolveDPcqOEQ.getValue();
        AbstractC3159y.g(value, "null cannot be cast to non-null type android.graphics.Typeface");
        return (Typeface) value;
    }
}
