package ci.jvision.admin201618033.service;

import ci.jvision.admin201618033.domain.products.Products;
import ci.jvision.admin201618033.domain.products.ProductsRepository;
import ci.jvision.admin201618033.web.dto.ProductsListResponseDto;
import ci.jvision.admin201618033.web.dto.ProductsSaveRequestDto;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

@RequiredArgsConstructor
@Service
public class ProductsService {
    private final ProductsRepository productsRepository;

    @Transactional
    public Long save(ProductsSaveRequestDto requestDto)
    {
        return productsRepository.save(requestDto.toEntity()).getP_id();
    }


    @Transactional
    public List<ProductsListResponseDto> findAllDesc()
    {
        return productsRepository.findAllDesc().stream()
                .map(ProductsListResponseDto::new)
                .collect(Collectors.toList());
    }
}

