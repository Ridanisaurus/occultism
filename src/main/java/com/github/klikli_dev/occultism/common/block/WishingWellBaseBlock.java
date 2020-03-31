/*
 * MIT License
 *
 * Copyright 2020 klikli-dev
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT
 * OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */

package com.github.klikli_dev.occultism.common.block;

import com.github.klikli_dev.occultism.registry.OccultismBlocks;
import net.minecraft.block.Blocks;
import vazkii.patchouli.api.PatchouliAPI;

import java.util.Arrays;

public class WishingWellBaseBlock {
    //region Fields
    //TODO: replace stairs with directional variants
    private final String[][] pattern = new String[][]{
            {
                    "SSSSS",
                    "SSSSS",
                    "SS SS",
                    "SSSSS",
                    "SSSSS",
            },
            {
                    "     ",
                    " OSO ",
                    " S S ",
                    " OSO ",
                    "     ",
            },
            {
                    "     ",
                    " B B ",
                    "     ",
                    " B B ",
                    "     ",
            },
            {
                    "     ",
                    " B B ",
                    "     ",
                    " B B ",
                    "     ",
            },
            {
                    "     ",
                    " OSO ",
                    " S S ",
                    " OSO ",
                    "     ",
            },
            {
                    "SSSSS",
                    "SOOOS",
                    "SO0OS",
                    "SOOOS",
                    "SSSSS",
            }
    };
    protected PatchouliAPI.IPatchouliAPI api = PatchouliAPI.instance;
    //endregion Fields

    //region Methods
    protected void setupMapping() {
        Arrays.asList(
                'S', this.api.looseBlockMatcher(OccultismBlocks.OTHERSTONE_STAIRS.get()),
                //    '0', this.api.displayOnlyMatcher(OccultismBlocks.WISHING_WELL_BASE.get()),
                'B', this.api.looseBlockMatcher(Blocks.STONE_BRICK_WALL),
                'O', this.api.looseBlockMatcher(OccultismBlocks.OTHERSTONE.get()),
                'A', this.api.airMatcher(),
                ' ', this.api.anyMatcher());
    }
    //endregion Methods
}
