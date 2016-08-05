package com.tokopedia.tokopediaapitest.model;

import java.util.List;

/**
 * Created by Erry on 8/3/2016.
 */
public class Product {


    /**
     * error_code : 0
     * message : OK
     */

    private Status status;
    /**
     * total_data : 22265354
     */

    private Header header;
    /**
     * selected_id :
     */

    private Category category;
    /**
     * user_id : 0
     */

    private Filter filter;
    /**
     * id : 17861894
     * name : Cincin Kristal Putih Import
     * uri : https://www.tokopedia.com/marrieanne/cincin-kristal-putih-import
     * image_uri : https://ecs7.tokopedia.net/img/cache/200-square/product-1/2015/8/27/258125/258125_d37c9cc5-4ab2-476e-9f7f-0e488169914d.jpg
     * price : Rp 129.000
     * shop : {"id":258125,"name":"Marrie Anne Jewelry","uri":"https://www.tokopedia.com/marrieanne","is_gold":0,"rating":{"speed":3,"accuracy":5,"service":3,"reputation_score":152,"reputation_set":1,"reputation_level":5},"location":"Jakarta","reputation_image_uri":"https://ecs7.tokopedia.net/img/repsys/bronze-5-hd.gif","shop_lucky":"https://clover.tokopedia.com/badges/merchant/v1?shop_id=258125","domain":""}
     * condition : 1
     * preorder : 0
     * department_id : 251
     * badges : [{"title":"Lucky Merchant","image_url":"https://clover.tokopedia.com/badges/merchant/v1?shop_id=258125"}]
     */

    private List<Data> data;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public Header getHeader() {
        return header;
    }

    public void setHeader(Header header) {
        this.header = header;
    }

    public Category getCategory() {
        return category;
    }

    public void setCategory(Category category) {
        this.category = category;
    }

    public Filter getFilter() {
        return filter;
    }

    public void setFilter(Filter filter) {
        this.filter = filter;
    }

    public List<Data> getData() {
        return data;
    }

    public void setData(List<Data> data) {
        this.data = data;
    }

    public static class Status {
        private int error_code;
        private String message;

        public int getError_code() {
            return error_code;
        }

        public void setError_code(int error_code) {
            this.error_code = error_code;
        }

        public String getMessage() {
            return message;
        }

        public void setMessage(String message) {
            this.message = message;
        }
    }

    public static class Header {
        private int total_data;

        public int getTotal_data() {
            return total_data;
        }

        public void setTotal_data(int total_data) {
            this.total_data = total_data;
        }
    }

    public static class Category {
        private String selected_id;

        public String getSelected_id() {
            return selected_id;
        }

        public void setSelected_id(String selected_id) {
            this.selected_id = selected_id;
        }
    }

    public static class Filter {
        private int user_id;

        public int getUser_id() {
            return user_id;
        }

        public void setUser_id(int user_id) {
            this.user_id = user_id;
        }
    }

    public static class Data {
        private int id;
        private String name;
        private String uri;
        private String image_uri;
        private String price;
        /**
         * id : 258125
         * name : Marrie Anne Jewelry
         * uri : https://www.tokopedia.com/marrieanne
         * is_gold : 0
         * rating : {"speed":3,"accuracy":5,"service":3,"reputation_score":152,"reputation_set":1,"reputation_level":5}
         * location : Jakarta
         * reputation_image_uri : https://ecs7.tokopedia.net/img/repsys/bronze-5-hd.gif
         * shop_lucky : https://clover.tokopedia.com/badges/merchant/v1?shop_id=258125
         * domain :
         */

        private Shop shop;
        private int condition;
        private int preorder;
        private int department_id;
        /**
         * title : Lucky Merchant
         * image_url : https://clover.tokopedia.com/badges/merchant/v1?shop_id=258125
         */

        private List<Badges> badges;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public String getUri() {
            return uri;
        }

        public void setUri(String uri) {
            this.uri = uri;
        }

        public String getImage_uri() {
            return image_uri;
        }

        public void setImage_uri(String image_uri) {
            this.image_uri = image_uri;
        }

        public String getPrice() {
            return price;
        }

        public void setPrice(String price) {
            this.price = price;
        }

        public Shop getShop() {
            return shop;
        }

        public void setShop(Shop shop) {
            this.shop = shop;
        }

        public int getCondition() {
            return condition;
        }

        public void setCondition(int condition) {
            this.condition = condition;
        }

        public int getPreorder() {
            return preorder;
        }

        public void setPreorder(int preorder) {
            this.preorder = preorder;
        }

        public int getDepartment_id() {
            return department_id;
        }

        public void setDepartment_id(int department_id) {
            this.department_id = department_id;
        }

        public List<Badges> getBadges() {
            return badges;
        }

        public void setBadges(List<Badges> badges) {
            this.badges = badges;
        }

        public static class Shop {
            private int id;
            private String name;
            private String uri;
            private int is_gold;
            /**
             * speed : 3
             * accuracy : 5
             * service : 3
             * reputation_score : 152
             * reputation_set : 1
             * reputation_level : 5
             */

            private Rating rating;
            private String location;
            private String reputation_image_uri;
            private String shop_lucky;
            private String domain;

            public int getId() {
                return id;
            }

            public void setId(int id) {
                this.id = id;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public String getUri() {
                return uri;
            }

            public void setUri(String uri) {
                this.uri = uri;
            }

            public int getIs_gold() {
                return is_gold;
            }

            public void setIs_gold(int is_gold) {
                this.is_gold = is_gold;
            }

            public Rating getRating() {
                return rating;
            }

            public void setRating(Rating rating) {
                this.rating = rating;
            }

            public String getLocation() {
                return location;
            }

            public void setLocation(String location) {
                this.location = location;
            }

            public String getReputation_image_uri() {
                return reputation_image_uri;
            }

            public void setReputation_image_uri(String reputation_image_uri) {
                this.reputation_image_uri = reputation_image_uri;
            }

            public String getShop_lucky() {
                return shop_lucky;
            }

            public void setShop_lucky(String shop_lucky) {
                this.shop_lucky = shop_lucky;
            }

            public String getDomain() {
                return domain;
            }

            public void setDomain(String domain) {
                this.domain = domain;
            }

            public static class Rating {
                private int speed;
                private int accuracy;
                private int service;
                private int reputation_score;
                private int reputation_set;
                private int reputation_level;

                public int getSpeed() {
                    return speed;
                }

                public void setSpeed(int speed) {
                    this.speed = speed;
                }

                public int getAccuracy() {
                    return accuracy;
                }

                public void setAccuracy(int accuracy) {
                    this.accuracy = accuracy;
                }

                public int getService() {
                    return service;
                }

                public void setService(int service) {
                    this.service = service;
                }

                public int getReputation_score() {
                    return reputation_score;
                }

                public void setReputation_score(int reputation_score) {
                    this.reputation_score = reputation_score;
                }

                public int getReputation_set() {
                    return reputation_set;
                }

                public void setReputation_set(int reputation_set) {
                    this.reputation_set = reputation_set;
                }

                public int getReputation_level() {
                    return reputation_level;
                }

                public void setReputation_level(int reputation_level) {
                    this.reputation_level = reputation_level;
                }
            }
        }

        public static class Badges {
            private String title;
            private String image_url;

            public String getTitle() {
                return title;
            }

            public void setTitle(String title) {
                this.title = title;
            }

            public String getImage_url() {
                return image_url;
            }

            public void setImage_url(String image_url) {
                this.image_url = image_url;
            }
        }
    }
}
