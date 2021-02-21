import React from 'react';
import { ReactComponent as ProductImage} from '../../../../core/assets/images/ProductImage.svg';
import './styles.scss';

const ProductCard = () => (
    <div className="card-base border-radius-10 product-card">
        <ProductImage />
    </div>
    
);

export default ProductCard;