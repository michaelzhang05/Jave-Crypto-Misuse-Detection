package g5;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.leanback.widget.HeaderItem;
import androidx.leanback.widget.PageRow;
import androidx.leanback.widget.Presenter;
import androidx.leanback.widget.RowHeaderPresenter;
import com.uptodown.R;
import e5.C2640a;
import kotlin.jvm.internal.AbstractC3159y;

/* loaded from: classes5.dex */
public final class j extends RowHeaderPresenter {
    @Override // androidx.leanback.widget.RowHeaderPresenter, androidx.leanback.widget.Presenter
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public RowHeaderPresenter.ViewHolder onCreateViewHolder(ViewGroup viewGroup) {
        AbstractC3159y.i(viewGroup, "viewGroup");
        Object systemService = viewGroup.getContext().getSystemService("layout_inflater");
        AbstractC3159y.g(systemService, "null cannot be cast to non-null type android.view.LayoutInflater");
        return new RowHeaderPresenter.ViewHolder(((LayoutInflater) systemService).inflate(R.layout.tv_icon_header_item, viewGroup, false));
    }

    @Override // androidx.leanback.widget.RowHeaderPresenter, androidx.leanback.widget.Presenter
    public void onBindViewHolder(Presenter.ViewHolder viewHolder, Object item) {
        AbstractC3159y.i(viewHolder, "viewHolder");
        AbstractC3159y.i(item, "item");
        HeaderItem headerItem = ((PageRow) item).getHeaderItem();
        AbstractC3159y.g(headerItem, "null cannot be cast to non-null type com.uptodown.tv.model.IconHeaderItem");
        C2640a c2640a = (C2640a) headerItem;
        View view = viewHolder.view;
        view.setFocusable(true);
        View findViewById = view.findViewById(R.id.iv_icon_header_item);
        AbstractC3159y.h(findViewById, "rootView.findViewById(R.id.iv_icon_header_item)");
        ((ImageView) findViewById).setImageDrawable(ContextCompat.getDrawable(view.getContext(), c2640a.a()));
        View findViewById2 = view.findViewById(R.id.tv_name_header_item);
        AbstractC3159y.h(findViewById2, "rootView.findViewById(R.id.tv_name_header_item)");
        TextView textView = (TextView) findViewById2;
        textView.setTypeface(E4.j.f2274g.t());
        textView.setText(c2640a.getName());
    }
}
