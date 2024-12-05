package cm.aptoide.pt.comments.view;

import cm.aptoide.pt.comments.CommentAdder;
import cm.aptoide.pt.dataprovider.model.v7.Comment;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class ConcreteItemCommentAdder<T> extends CommentAdder {
    private final ItemCommentAdderView commentAdderView;
    private final T review;

    public ConcreteItemCommentAdder(int i2, ItemCommentAdderView itemCommentAdderView, T t) {
        super(i2);
        this.commentAdderView = itemCommentAdderView;
        this.review = t;
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [cm.aptoide.pt.comments.view.CommentsAdapter] */
    /* JADX WARN: Type inference failed for: r4v3, types: [cm.aptoide.pt.view.recycler.BaseAdapter, cm.aptoide.pt.comments.view.CommentsAdapter] */
    @Override // cm.aptoide.pt.comments.CommentAdder
    public void addComment(List<Comment> list) {
        ArrayList arrayList = new ArrayList();
        this.commentAdderView.createDisplayableComments(list, arrayList);
        int itemPosition = this.commentAdderView.getAdapter().getItemPosition(this.itemIndex);
        if (list.size() > 2) {
            arrayList.add(this.commentAdderView.createReadMoreDisplayable(itemPosition, this.review));
        }
        this.commentAdderView.getAdapter().addDisplayables(itemPosition + 1, arrayList);
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [cm.aptoide.pt.view.recycler.BaseAdapter, cm.aptoide.pt.comments.view.CommentsAdapter] */
    /* JADX WARN: Type inference failed for: r2v6, types: [cm.aptoide.pt.view.recycler.BaseAdapter, cm.aptoide.pt.comments.view.CommentsAdapter] */
    @Override // cm.aptoide.pt.comments.CommentAdder
    public void collapseComments() {
        ?? adapter = this.commentAdderView.getAdapter();
        int itemPosition = adapter.getItemPosition(this.itemIndex);
        int itemPosition2 = adapter.getItemPosition(this.itemIndex + 1);
        if (itemPosition2 == -1) {
            itemPosition2 = this.commentAdderView.getAdapter().getItemCount();
        }
        adapter.removeDisplayables(itemPosition + 1, itemPosition2 - 1);
    }
}
