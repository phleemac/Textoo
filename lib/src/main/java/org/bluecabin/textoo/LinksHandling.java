package org.bluecabin.textoo;

/**
 * Created by fergus on 1/5/16.
 */
interface LinksHandling<C extends BaseConfigurator> {
    void handleTextooLinks();
    void addLinksHandler(LinksHandler handler);
}